# Stock Simulator — Evolutionary AI Traders

A stock market simulation where **100 autonomous AI agents** compete in an evolving economy. Each agent has a unique neural network strategy that adapts over generations via neuroevolution.

📄 **[Read the full documentation (PDF)](https://github.com/woodyhoko/Stock_Simulator/blob/main/readme.pdf)**

---

## Overview

<img src="https://raw.githubusercontent.com/woodyhoko/Stock_Simulator/main/d1.png" width="800">

Each AI trader is driven by a neural network that observes market signals (price history, volume, portfolio state) and outputs buy/sell/hold decisions. The simulation runs for hundreds of market cycles; losing strategies die off, winning strategies reproduce with mutation.

---

## Key Features

- 🤖 **100 concurrent AI agents** — each with a unique evolved trading strategy
- 📈 **Simulated market dynamics** — price moves emerge from agent interactions (supply/demand)
- 🧬 **Neuroevolution** — agents that profit reproduce; losers are replaced
- 📊 **Live visualization** — real-time portfolio and market charts

---

## Screenshots

<img src="https://raw.githubusercontent.com/woodyhoko/Stock_Simulator/main/d2.png" width="400">

---

## Run

The simulator ships as a self-contained Java application:

```bash
# Unzip and run (Java required)
# See readme.pdf for full instructions
```

Full setup instructions, parameter descriptions, and architecture details are in the [PDF documentation](https://github.com/woodyhoko/Stock_Simulator/blob/main/readme.pdf).

