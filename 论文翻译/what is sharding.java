//将每段翻译放到对应段落下方

What is Sharding? Guide to this Ethereum Scaling Concept Explained
什么是分片？ 这个就是以太坊尺度概念的指南解释
As the scaling debate in cryptocurrencies continues, some potential solutions have actually been in development for quite some time now.
Specifically, in the case of Ethereum, where a large focus is placed on decentralization and security at the expense of scalability, 
the application of sharding in conjunction with implementing Proof of Stake consensus is seen as the much needed mechanism through 
which the network can scale to practical levels for applications while still retaining its decentralization and security.
随着加密货币的扩展争论仍在继续，一些潜在的解决方案实际上已经开发了很长一段时间了。具体而言，在以太坊中，以可扩展性为代价将重点放在分散化和安全性上，
将分片与实施利益共识一致的应用视为网络可扩展到的急需机制。 应用程序的实际水平，同时仍保持其权力下放和安全性。
Sharding is a complex topic, especially when applied to a decentralized, peer to peer network such as Ethereum where the global 
state of the network constantly is updated. So what exactly is sharding and how can it help blockchain networks to scale?
分片是一个复杂的主题，特别是当应用于分散的对等网络（如以太坊）时，网络的全局状态不断更新。 那么什么是分片呢？它如何帮助区块链网络扩展呢？
Sharding and Distributed Computing Background
分片和分布式计算背景
Sharding is actually much older than blockchain technology and has been implemented in a variety of systems from business database 
optimizations to Google’s global Spanner database. Essentially, sharding is a particular method for horizontally partitioning data 
within a database. More generally, the database is broken into little pieces called “shards”, that when aggregated together form 
the original database.
分片实际上比区块链技术早得多，并且已在各种系统中实施，从业务数据库优化到Google的全球Spanner数据库。 实质上，分片是一种在数据库中水平分区数据
的特殊方法。 更一般地说，数据库被分成称为“分片”的小块，当它们聚合在一起形成原始数据库时。
In distributed blockchain networks, the network consists of a series of nodes connected in a peer to peer format, with no central 
authority. As is the case with current blockchain systems, each node stores all states of the network and processes all of the 
transactions. While this provides the high level security through decentralization, especially in Proof of Work systems such as 
Bitcoin and Ethereum, it leads to legitimate scaling problems.
在分布式区块链网络中，网络由一系列以对等格式连接的节点组成，没有中央权限。与当前区块链系统的情况一样，每个节点存储网络的所有状态并处理所有事务。
虽然这通过分散化提供了高级别的安全性，特别是在比特币和以太坊等工作证明系统中，但它会导致合法的扩展问题。
Using Ethereum as an example, a full node in the Ethereum network stores the entire state of the blockchain, including account 
balances, storage, and contract code. Unfortunately, as the network increases in size at an exponential pace, the consensus only 
increases linearly. This limitation is due to the communication needed between the nodes needed to reach consensus.
以以太坊为例，以太坊网络中的完整节点存储区块链的整个状态，包括账户余额，存储和合同代码。不幸的是，随着网络以指数速度增加，协商一致只会线性增加。
这种限制是由于达成共识所需的节点之间所需的通信。
Nodes in the network do not have special privileges and every node in the network stores and processes every transaction. As a result,
in a network the size of Ethereum’s, issues such as high gas costs and longer transaction confirmation times become noticeable 
problems when the network is strained. The network is only as fast as the individual nodes rather than the sum of its parts.
网络中的节点没有特殊权限，网络中的每个节点都存储和处理每个事务。因此，在以太网的大小网络中，当网络紧张时，诸如高燃气成本和更长的交易确认时间之类
的问题成为显着的问题。网络的速度与单个节点的速度一样快，而不是其各部分的总和。
Sharding helps to alleviate these issues by providing an interesting, yet complex solution. The concept involves grouping subsets 
of nodes into shards which in turn process transactions specific to that shard. It allows the system to process many transactions 
in parallel, thus significantly increasing throughput.
通过提供有趣但复杂的解决方案，分片有助于缓解这些问题。该概念涉及将节点子集分组为分片，然后分片处理特定于该分片的事务。它允许系统并行处理许多事务
，从而显着提高吞吐量。
A simpler way to put it would to be imagining the division of the United States into states. While each state (a shard in this case)
 is part of the larger United States (Ethereum network), they have their own specific rules, boundaries, and subsets of populations.
 However, they do share a universal language and culture as part of their larger network that makes up the country.
更简单的方法就是想象美国分裂为各州。虽然每个州（在这种情况下是一个碎片）是较大的美国（以太坊网络）的一部分，但它们有自己的特定规则，边界和人口子集。
然而，他们确实共享一种通用的语言和文化，作为构成国家的大型网络的一部分。
Or even better, in Vitalik Buterin’s own words:
甚至更好，用Vitalik Buterin自己的话来说：
 “Imagine that Ethereum has been split into thousands of islands. Each island can do its own thing. Each of the islands has its 
 own unique features and everyone belonging on that island i.e., the accounts, can interact with each other AND they can freely 
 indulge in all its features. If they want to contact other islands, they will have to use some sort of protocol.”
“想象一下，以太坊已被分裂成数千个岛屿。 每个岛屿都可以做自己的事情。 每个岛屿都有自己独特的特征，每个岛屿上的人，即帐户，都可以互相交流，
他们可以自由地沉迷于其所有的功能。 如果他们想要联系其他岛屿，他们将不得不使用某种协议。“
As you can see, the concept of fragmenting the network into more efficient pieces allows the network to function as the sum of 
its parts, rather than being limited by the speed of each individual node.
正如您所看到的，将网络分段为更高效的部分的概念允许网络作为其各部分的总和，而不是受每个单独节点的速度限制。
How Does Sharding Work in Blockchains?如何在区块链中进行分片？
We will continue to use Ethereum as an example in this as it is the most well-known and arduous sharding attempts in the blockchain 
arena, as the Ethereum developers are implementing what is known as “state sharding”.
我们将继续使用以太坊作为一个例子，因为它是区块链领域中最着名和最艰难的分片尝试，因为以太坊开发人员正在实施所谓的“状态分片”。
The current state of the Ethereum blockchain is known as the “global state” and is what everyone can see when they look at the 
blockchain at a specific instance. The tricky part in implementing sharding in Ethereum is that by sharding the nodes into 
smaller subsets, these subsets need to be able to process specific sets of transactions while simultaneously updating the state 
of the network, all while ensuring it is valid.
以太坊区块链的当前状态被称为“全局状态”，是每个人在查看特定实例的区块链时可以看到的。在以太坊实现分片的棘手部分是通过将节点分割成更小的子集，
这些子集需要能够处理特定的事务集，同时更新网络状态，同时确保它是有效的。
Sharding in Ethereum is supposed to be implemented in a two phase rollout, more than likely after Proof of Stake is implemented 
in the network. Phase one will be the data layer consisting of the consensus of what data is in the shards. Phase two is the 
state layer. All of this is very fluid, so a general breakdown of how it may work is below.
在以太坊中的分片应该在两阶段推出中实施，很可能在网络中实施了Stof of Stake之后。第一阶段将是数据层，其中包括碎片中数据的共识。第二阶段是状态层。
所有这些都是非常流畅的，因此下面将介绍它的工作方式。
Ethereum breaks down the network into specific shards. Each shard is assigned a specific group of transactions that is determined
by grouping specific accounts (including smart contracts) into a shard. Each transaction group has a header and a body that 
consist of the following.
以太坊将网络分解为特定的分片。为每个分片分配一组特定的事务，这些事务是通过将特定帐户（包括智能合约）分组到分片中来确定的。每个事务组都有
一个标题和一个由以下内容组成的正文。
Header头
The shard ID of the transaction group事务组的分片ID
Assignment of validators through random sampling (verify the transactions in the shard)通过随机抽样分配验证器（验证分片中的事务）
State Root (state of the merkle root of the shard before and after transactions added)根（添加事务之前和之后的分片的merkle根状态）

Body
All of the transactions that belong to the transaction group that are part of the specific shard.
属于特定分片的事务组的所有事务。
Transactions are specific to each shard and occur between accounts native to that shard. When transactions are verified, 
the state of the network changes and account balances, storage, etc are updated. In order for the transaction group to 
verify as valid, the pre-state root of the transaction group must match the shard root in the global state. If they match, 
the transaction group is validated and the global state is updated through the particular shard ID state root.
事务特定于每个分片，并发生在该分片的本机帐户之间。验证交易后，网络状态会发生变化，帐户余额，存储等也会更新。为了使事务组验证为有效，
事务组的预状态根必须与全局状态中的分片根匹配。如果它们匹配，则验证事务组，并通过特定的分片ID状态根更新全局状态。
Instead of only containing a state root, each block of the Ethereum blockchain now contains both a state root and the 
transaction group root. The transaction group root is the merkle root of all of the transaction groups from the specific 
shards for that block of transactions. Basically, there is a merkle root of all of the different shards that contain the 
updated and verified transaction groups. This root is stored in the blockchain along with the updated state root.
而不仅仅包含状态根，以太坊区块链的每个块现在都包含状态根和事务组根。事务组root是来自该事务块的特定分片的所有事务组的merkle根。基本上，
所有不同分片都有一个merkle根，其中包含更新和验证的事务组。此根与更新的状态根一起存储在区块链中。
The employment of merkle tree concepts in this structure is vital to ensuring validity of the blockchain. Understanding 
how a merkle tree and specifically a merkle root work, can help you to grasp these concepts much more easily.
在这种结构中使用merkle树概念对于确保区块链的有效性至关重要。了解merkle树，特别是merkle root如何工作，可以帮助您更轻松地掌握这些概念。
Consensus within a shard is reached through a Proof of Stake consensus of randomly selected nodes that are applied to a 
shard for specific consensus round. This not only provides finality to the consensus, which is necessary within the shards,
but also provides a particular defense to an attack that a Proof of Work blockchain would be susceptible to in this instance.
通过随机选择的节点的共同证明达成共享，在特定共识轮次中应用于分片。这不仅为分享中的共识提供了终结性，而且还为在这种情况下工作证明区块链易
受攻击的攻击提供了特定的防御。
The hash power required to overrun a specific shard in a PoW sharded network is drastically reduced and the ability for a
malicious actor to take over a shard through computational power is feasible. Through this, the bad actor could attack other
shards through the communication protocol which is one of the more complicated and important features of sharding architecture. 
 Random sampling selection of the validators within a shard manages to stifle this type of attack since a bad actor will not 
 know which shard they are being placed in before they are actually placed in it. Further, random sampling will be used to 
 select the validators that are actually validating from that random validating set.
在PoW分片网络中溢出特定分片所需的散列功率大大降低，并且恶意行为者通过计算能力接管分片的能力是可行的。通过这种方式，坏人可以通过通信协议攻击其他分片，这是分片架构的一个更复杂和重要的特性。对碎片内的验证器进行随机抽样选择可以扼杀这种类型的攻击，因为坏的演员在实际放入它之前不会知道它们被放入哪个碎片。此外，随机采样将用于选择实际从该随机验证集验证的验证器。
The communication protocol is vital to the sharding architecture functioning correctly in the system. You can think of the communication protocol as the universal language that is consistent among the states as part of the larger United States. However, designing this protocol is highly challenging and needs to be performed so that it is only used when necessary. It becomes necessary when a specific node requires information that is not stored within its own shard and needs to find the shard with the requisite information. This communication is known as cross-shard communication.
通信协议对于分片架构在系统中正确运行至关重要。您可以将通信协议视为通用语言，这些通用语言在作为较大美国的一部分的州之间是一致的。但是，设计此协议非常具有挑战性，需要执行以便仅在必要时使用。当特定节点需要未存储在其自己的分片中的信息并且需要查找具有必需信息的分片时，这变得必要。这种通信称为交叉分片通信。
The cross-shard communication is achieved through applying the concept of transaction receipts. The receipt for a transaction is stored in a merkle root that can be easily verified but that is not part of the state root. The shard receiving a transaction from another shard checks the merkle root to ensure that the receipt has not been spent. Essentially, the receipts are stored in a shared memory that can be verified by other shards, but not altered. Therefore, through a distributed storage of receipts, shards are able to communicate with each other.
通过应用交易收据的概念来实现交叉分片通信。事务的收据存储在merkle根目录中，该根目录可以轻松验证但不属于状态根目录。从另一个分片接收事务的分片检查merkle root以确保没有花费收据。基本上，收据存储在共享内存中，可以由其他分片验证，但不能更改。因此，通过收据的分布式存储，分片能够彼此通信。
Sharding Moving Forward分片发展
Sharding in Ethereum is expected to be implemented after the Casper PoS upgrade. Recently, there have been some developments regarding Ethereum 2.0 which involve implementing both Casper and sharding. Casper seems to be slated for 2019 while sharding will follow in 2020 or 2021.
预计将在Casper PoS升级后实施以太坊中的分片。最近，关于以太坊2.0的一些发展已涉及实施Casper和分片。 Casper似乎计划在2019年进行，而分类将在2020年或2021年进行。
Sharding has also been implemented in a few other platforms, most notably Zilliqa. However, Zilliqa does not implement state sharding at this time and instead focuses on providing a high throughput blockchain by utilizing transaction and computational sharding.
分片技术也已在其他一些平台上实施，尤其是Zilliqa。但是，Zilliqa此时并未实现状态分片，而是专注于通过利用事务和计算分片来提供高吞吐量的区块链。
Conclusion结论
Sharding serves to offer some promising solutions to the elephant in the room of blockchain platforms right now, 
scalability. While Bitcoin’s lightning network is in the testing phase and has been showing some very promising 
progress so far, Ethereum’s solution brings with it some unique challenges as it is pegged as a world computer that is Turing complete.
分片用于为区块链平台中的大象提供一些有前途的解决方案，可扩展性。虽然比特币的闪电网络正处于测试阶段，并且到目前为止已经展示了一些非常
有希望的进展，但以太坊的解决方案带来了一些独特的挑战，因为它被固定为图灵完整的世界计算机。
Sharding will directly work only at the protocol level, so to the end user or dapp developer it may not be necessarily 
relevant to learn about. Regardless, Ethereum’s attempt at state sharding for a vast, decentralized network is an 
impressive endeavor and will be an enormous feat of accomplishment if successfully implemented.
分片将仅在协议级别直接起作用，因此对于最终用户或dapp开发人员而言，它可能不一定与学习有关。无论如何，以太坊试图为一个庞大的，
分散的网络进行状态分割是一项令人印象深刻的努力，如果成功实施，将是一项巨大的成就。

