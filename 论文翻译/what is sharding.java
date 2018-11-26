//

All of the transactions that belong to the transaction group that are part of the specific shard.

属于特定分片的事务组的所有事务。

Transactions are specific to each shard and occur between accounts native to that shard. When transactions are verified, the state of the network changes and account balances, storage, etc are updated. In order for the transaction group to verify as valid, the pre-state root of the transaction group must match the shard root in the global state. If they match, the transaction group is validated and the global state is updated through the particular shard ID state root.

事务特定于每个分片，并发生在该分片的本机帐户之间。验证交易后，网络状态会发生变化，帐户余额，存储等也会更新。为了使事务组验证为有效，事务组的预状态根必须与全局状态中的分片根匹配。如果它们匹配，则验证事务组，并通过特定的分片ID状态根更新全局状态。

Instead of only containing a state root, each block of the Ethereum blockchain now contains both a state root and the transaction group root. The transaction group root is the merkle root of all of the transaction groups from the specific shards for that block of transactions. Basically, there is a merkle root of all of the different shards that contain the updated and verified transaction groups. This root is stored in the blockchain along with the updated state root.

而不仅仅包含状态根，以太坊区块链的每个块现在都包含状态根和事务组根。事务组root是来自该事务块的特定分片的所有事务组的merkle根。基本上，所有不同分片都有一个merkle根，其中包含更新和验证的事务组。此根与更新的状态根一起存储在区块链中。

The employment of merkle tree concepts in this structure is vital to ensuring validity of the blockchain. Understanding how a merkle tree and specifically a merkle root work, can help you to grasp these concepts much more easily.

在这种结构中使用merkle树概念对于确保区块链的有效性至关重要。了解merkle树，特别是merkle root如何工作，可以帮助您更轻松地掌握这些概念。

Consensus within a shard is reached through a Proof of Stake consensus of randomly selected nodes that are applied to a shard for specific consensus round. This not only provides finality to the consensus, which is necessary within the shards, but also provides a particular defense to an attack that a Proof of Work blockchain would be susceptible to in this instance.

通过随机选择的节点的共同证明达成共享，在特定共识轮次中应用于分片。这不仅为分享中的共识提供了终结性，而且还为在这种情况下工作证明区块链易受攻击的攻击提供了特定的防御。

The hash power required to overrun a specific shard in a PoW sharded network is drastically reduced and the ability for a malicious actor to take over a shard through computational power is feasible. Through this, the bad actor could attack other shards through the communication protocol which is one of the more complicated and important features of sharding architecture. Random sampling selection of the validators within a shard manages to stifle this type of attack since a bad actor will not know which shard they are being placed in before they are actually placed in it. Further, random sampling will be used to select the validators that are actually validating from that random validating set.

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
