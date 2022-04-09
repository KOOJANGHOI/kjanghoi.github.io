---
layout: post
title: 5.Reinforcement Learning 
subtitle: 
categories: [ArtificialIntelligence]
tags: [ComputerScience]
---

### Classification of Machine Learning 
￼
![1.1](/assets/images/ai/5.2.png)

### Reinforcement Learning
Unsupervised Learning의 일종으로, 에이전트가 자신이 수행한 행동에 대하여 보상값(reward)을 받아 점차적으로 효율적인 방식으로 행동을 강화시키는 학습 방법 
- 반복적인 시도를 통해 시행착오를 겪으며 주어지는 외부 환경으로 부터의 Reward을 통해 Goal에 도달하는 방법으로 학습해 나가는 형태의 기계 학습 

**Properties**
- Delayed reward : 시행착오 중에 선택한 Action이 적합한 선택인지 당장 알 수 없다 
- 현재 선택한 Action의 결과를 정확히 알 수 없어도 무관하다 
- Life-long learning에 활용 가능
	- deterministic하지 않고 항상 오차가 존재하는 상황(e.g. 컴퓨터 내의 정보처리가 아니라 물리적인 세상)
￼
![1.1](/assets/images/ai/5.1.png)

### Q-Learning 
Reinforcement Learning 가운데 가장 널리 사용되는 기계학습 알고리즘  
￼
![1.1](/assets/images/ai/5.3.png)

- 현재 상태에서 선택 가능한 Action중에 임의의 Action을 선택하고 실행 한 뒤, 외부환경으로부터 Reward를 받음(시행착오) 
- 학습 시점에서는 Action에 대한 평가가 완료되지 않았으므로, 해당 시점에서 최적으로 평가 된 Action이라도, 실제로는 최적 Action이 아닐 수 있음 
- Action에 대한 Reward를 전파하는 형태로 학습 

**estimated utility function Q(s,a) **
: State s 에서 Action a를 선택하는 것이 유리한 정도  
- Q(s,a)의 학습이 완료되면 각 Step 마다 현재 State s 에 대하여 평가함수 Q(s, a)를 최대화하는 Action a 를 선택하는 방식으로 이동  
￼
![1.1](/assets/images/ai/5.4.png)

- Immediate reward
    - Action a를 선택했을 시 주어지는 즉각적인 reward
- Delayed reward
    - 시행착오 중에 선택한 Action이 적합한 선택인지 당장 알 수 없으므로, 다음 state에서 선택할 수 있는 모든 action의 reward에 전파되는 정도를 나타내는 계수 [0,1]을 곱하여 계산

#### The algorithm 
￼
![1.1](/assets/images/ai/5.5.png)

#### Example
￼
![1.1](/assets/images/ai/5.6.png)

위와 같은 형태의 공간 상 임의의 위치에서 시작해서 S6으로 이동하도록 학습시키는 문제 

![1.1](/assets/images/ai/5.7.png)
￼
Q(s,a)는 State s에서 선택 가능한 Action a를 선택 했을 때 유리한 정도를 나타내는 Function. 학습 전 초기값은 모두 0으로 초기화

![1.1](/assets/images/ai/5.8.png)

![1.1](/assets/images/ai/5.9.png)

![1.1](/assets/images/ai/5.10.png)

![1.1](/assets/images/ai/5.11.png)

![1.1](/assets/images/ai/5.12.png)

![1.1](/assets/images/ai/5.13.png)

![1.1](/assets/images/ai/5.14.png)

![1.1](/assets/images/ai/5.15.png)

![1.1](/assets/images/ai/5.16.png)

![1.1](/assets/images/ai/5.17.png)

![1.1](/assets/images/ai/5.18.png)

![1.1](/assets/images/ai/5.19.png)

![1.1](/assets/images/ai/5.20.png)

![1.1](/assets/images/ai/5.21.png)

![1.1](/assets/images/ai/5.22.png)

![1.1](/assets/images/ai/5.23.png)

![1.1](/assets/images/ai/5.24.png)

![1.1](/assets/images/ai/5.25.png)

![1.1](/assets/images/ai/5.26.png)

![1.1](/assets/images/ai/5.27.png)

![1.1](/assets/images/ai/5.28.png)

![1.1](/assets/images/ai/5.29.png)

![1.1](/assets/images/ai/5.30.png)
