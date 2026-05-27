# Stock Simulator — 100 Evolving AI Traders

**Ho Ko** — CSIE, National Central University

📄 **[Full Documentation (PDF)](https://github.com/woodyhoko/Stock_Simulator/blob/main/readme.pdf)**

---

## Overview

A real-time stock market simulation where **100 autonomous AI agents** from two competing species (`A` and `B`) trade against each other. Each agent runs a unique neural network trading strategy. Agents that profit survive; those that don't are eliminated. The population evolves over hundreds of rounds using techniques drawn from deep learning, SVM, Hopfield networks, and the NEAT algorithm.

<img src="https://raw.githubusercontent.com/woodyhoko/Stock_Simulator/main/d1.png" width="800">

---

## Simulation Design

### Two-Species Market Ecology

The simulation uses two competing agent species:
- **Species A** — 5 initial agents, 5 of Species B, 300 total rounds
- **Species B** — same parameters, opposing trading objective

Agents start with a bank value of 0. Each round, agents decide to buy or sell based on their internal model. An agent is eliminated when its portfolio value drops to 0. The market price emerges from the aggregate buy/sell pressure of all surviving agents — no external price feed.

### AI Techniques Per Agent

Each agent can use one of several AI approaches:
- **Deep Learning** (MLP with backpropagation)
- **SVM** (Support Vector Machine for signal classification)
- **Hopfield Network** (associative memory for pattern recall)
- **NEAT** (NeuroEvolution of Augmenting Topologies — evolves network structure)

The mix of architectures within the population creates genuine diversity in trading strategies — some agents are trend-followers, others are mean-reversion traders, others are adversarial.

### Agent Modes

| Mode | Behavior |
|---|---|
| **Extreme AI** | Agent trades aggressively at maximum confidence |
| **Too Safe** | Agent only trades when signal is very strong — misses opportunities |

---

## Screenshots

<img src="https://raw.githubusercontent.com/woodyhoko/Stock_Simulator/main/d2.png" width="500">

---

## Interface Controls

| Control | Action |
|---|---|
| **Run** | Start the simulation |
| **Join Game** | Connect as a human player |
| **Restart** | Reset to initial state |
| **Extreme AI / Too Safe** | Toggle agent risk profile |
| **Next Round** | Advance one round manually |
| **Reset User** | Clear human player state |
| **Check** | Inspect a specific agent's portfolio |
| **Eliminated AI** | View removed agents |

The log panel shows per-round portfolio values for all agents, and a currency chart tracks bank value over time for Species A and B separately.

---

## Run

The simulator ships as a compiled Java application (built with Processing 3):

**32-bit:** `finalproject.exe` (32-bit folder)  
**64-bit:** `finalproject.exe` (64-bit folder)

Java is required. A bundled 64-bit JRE (~55 MB) is included for systems without Java pre-installed.

```bash
# Extract the zip and run the executable for your OS architecture.
# See readme.pdf for full parameter descriptions and advanced configuration.
```

📄 **[Full setup guide and parameter reference → readme.pdf](https://github.com/woodyhoko/Stock_Simulator/blob/main/readme.pdf)**

---

## Built With

- **Processing 3** (Java-based creative coding environment)
- Neural network implementations in Java
- Real-time chart rendering via Processing's graphics API
