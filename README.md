# Stock Simulator — 100 Evolving AI Traders

*A multi-agent artificial market where neural-network traders from two competing species drive price formation, survive by profitability, and evolve over hundreds of rounds.*

**Ho Ko** — CSIE, National Central University

📄 **[Full Documentation (PDF)](https://github.com/woodyhoko/Stock_Simulator/blob/main/readme.pdf)** | **[▶ Browser Demo](demo.html)**

<img src="https://raw.githubusercontent.com/woodyhoko/Stock_Simulator/main/d1.png" width="800">

---

## 1. Overview

Classical financial models assume rational, homogeneous agents with perfect information (Efficient Market Hypothesis, Fama 1970). Empirical markets exhibit phenomena these models cannot explain: excess volatility, fat-tailed return distributions, momentum and mean-reversion, and herding. **Agent-based financial models** (Tesfatsion & Judd 2006; LeBaron 2006) address this by replacing the representative agent with a *heterogeneous* population of boundedly rational traders whose interactions generate market dynamics from the bottom up.

This simulator is in that tradition: 100 AI agents from two competing species trade a single asset over 300 rounds. The market price at each round is **endogenous** — it emerges from the aggregate buy/sell pressure of all surviving agents rather than being imposed externally. Agents that make profits survive; those that go bankrupt are eliminated. The population evolves as a consequence of competitive selection.

---

## 2. Market mechanism

### 2.1 Two-species ecology

The population is divided into two genetically isolated species (A and B), each starting with 50 agents. Each species has its own trading objective: species A targets a profit signal while species B acts as a counter-party. This asymmetry is inspired by real markets where market-makers (liquidity providers) and directional traders (trend-followers) constitute structurally different ecological niches.

### 2.2 Price formation

The market price at round *t* is determined by a simplified **Walrasian tatonnement** process: excess demand from all living agents pushes price up; excess supply pushes it down.

```
ΔP_t = α · (Σ buy_orders − Σ sell_orders) / N_alive  +  ε_t
P_t  = P_{t-1} + ΔP_t                                 ε_t ~ N(0, σ²)
```

Each agent's order size is proportional to its confidence signal and current bank value. This creates a **reflexive** feedback: agent decisions determine price, which determines agent payoffs, which determine future decisions.

### 2.3 Bankruptcy and elimination

An agent is eliminated when its portfolio value drops to zero. Eliminated agents are replaced by offspring of the surviving population (clones with mutated parameters), maintaining the population size and implementing evolutionary selection pressure.

---

## 3. AI architectures

Each agent's trading decision is computed by one of four model types:

### 3.1 Deep Learning (MLP)

A multi-layer perceptron trained online via backpropagation. Input features: recent price returns (sliding window), moving average ratios, volume proxies. Output: buy/sell/hold signal with confidence.

```
input: [Δp_{t-1}, ..., Δp_{t-k}, MA_short/MA_long, volatility_proxy]
hidden: ReLU layers
output: tanh(x) ∈ [−1, 1]  (negative = sell, positive = buy)
```

Weights are updated after each round using a reward proportional to the PnL of the last action.

### 3.2 Support Vector Machine

An SVM classifier distinguishes "buy" from "sell" signals from price-derived features (momentum, RSI-proxy, mean-reversion indicator). The kernel trick (RBF kernel) allows the SVM to find non-linear decision boundaries in feature space.

### 3.3 Hopfield Network

An associative memory (Hopfield 1982) stores a small number of historical "pattern" price sequences as attractors. When presented with a new price window, the network converges to the nearest stored attractor and predicts whether the pattern historically resolved as an upward or downward move. Effective for pattern-based technical analysis.

### 3.4 NEAT (NeuroEvolution of Augmenting Topologies)

Unlike the fixed-topology MLP, NEAT agents (Stanley & Miikkulainen 2002) evolve both their weights and network structure. New nodes and connections are added or removed over generations, allowing the network topology to grow in complexity only when warranted by the task. NEAT agents within the population compete to find minimal-complexity controllers that exploit market regularities.

---

## 4. Agent modes

| Mode | Behaviour |
|---|---|
| **Extreme AI** | Bets the maximum allowed fraction of portfolio on each signal |
| **Too Safe** | Only trades when signal confidence exceeds a high threshold — misses many opportunities |

The diversity of architectures and risk modes within the population creates a **heterogeneous** agent ecology, which is precisely what empirical agent-based models show is necessary to reproduce real market statistics (fat tails, volatility clustering).

---

## 5. Emergent phenomena

Across repeated runs, several phenomena consistent with the empirical finance literature emerge:

- **Volatility clustering** — periods of large price swings cluster together (agents overreact after a loss, increasing risk)
- **Trend-following and mean-reversion** — at different time scales, momentum (NEAT/MLP agents) and reversion (SVM agents) coexist
- **Herding collapses** — when many agents converge on the same signal, coordinated one-sided markets produce sudden crashes
- **Ecological succession** — which model type dominates shifts over time as the market regime changes

---

## 6. Interface controls

| Control | Function |
|---|---|
| **Run** | Start the simulation |
| **Join Game** | Enter as a human trader |
| **Next Round** | Advance one round manually |
| **Extreme AI / Too Safe** | Toggle agent risk profile |
| **Check** | Inspect a specific agent's portfolio history |
| **Eliminated AI** | View the list of bankrupt agents |

---

## 7. Run

The simulator ships as a compiled Java application (built with Processing 3):

```
32-bit: finalproject.exe  (32-bit/ folder)
64-bit: finalproject.exe  (64-bit/ folder)
```

A bundled JRE is included. See **[readme.pdf](https://github.com/woodyhoko/Stock_Simulator/blob/main/readme.pdf)** for full parameter reference.

**Browser demo:** open [`demo.html`](demo.html) for a JavaScript port with live price chart and leaderboard.

<img src="https://raw.githubusercontent.com/woodyhoko/Stock_Simulator/main/d2.png" width="500">

---

## 8. Built with

**Processing 3** (Java) · Neural network implementations in Java · Real-time chart rendering

---

## 9. References

1. E. F. Fama. "Efficient Capital Markets: A Review of Theory and Empirical Work." *Journal of Finance*, 25(2):383–417, 1970.
2. L. Tesfatsion and K. L. Judd (eds.). *Handbook of Computational Economics, Vol. 2: Agent-Based Computational Economics.* Elsevier, 2006.
3. B. LeBaron. "Agent-based Computational Finance." *Handbook of Computational Economics*, Vol. 2, 2006.
4. J. J. Hopfield. "Neural networks and physical systems with emergent collective computational abilities." *PNAS*, 79(8):2554–2558, 1982.
5. K. O. Stanley and R. Miikkulainen. "Evolving Neural Networks through Augmenting Topologies." *Evolutionary Computation*, 10(2):99–127, 2002.
