package com.SpringBootProject.CoinsRankingApp_RedisStackWithSpringBoot;

/*
Changing git username and email for VCS
	$ git config user.name // Returns username
	$ git config user.email // Returns user email
	$ git config --global user.name "USER NAME" // Changes to USER NAME
	$ git config --global user.email "102715150+Gilfoyle24x7@users.noreply.github.com" // No reply email will be available in Github->Settings->Emails->Copy is available or add an email address to get it
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoinsRankingAppRedisStackWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinsRankingAppRedisStackWithSpringBootApplication.class, args);
	}

}

/*
Redis stack - It is an extension of Redis that adds modern data models and processing engines to provide a complete developer experience

Redis Stack features
	- Queryable JSON documents
	- Full-text search
	- Time series data(ingestion and querying)
	- Graph data model with Cypher query language
	- Probabilistic data structures


Why Redis stack?
	- Developer focused to create Realtime Applications
	- Sub milliseconds processing time
	- Modern data models and data processing tools(Document, Graph, Search and Time series)
	- Several Redis client libraries support Redis stack
	- Redis stack also includes Redis Insight - A visualization tool for understanding and optimizing Redis data


Components of Redis Stack - RedisSearch, RedisGraph, RedisTimeseries, RedisBloom, RedisInsight


RedisSearch - It provides secondary indexing, full-text search, and a query language for Redis
	- These feature enable multi-field queries, aggregation, exact phrase matching, and numeric filtering for text queries
	- https://redis.io/commands/?name=ft



RedisJSON - It provides JSON support to Redis. RedisJSON lets store, update and retrieve JSON values in Redis
	- It works seamlessly with RedisSearch to let index and query the JSON documents
	- https://redis.io/commands/?group=json
	= It provides Full support for the JSON standard
	- It is a JSON Path like syntax for selecting elements inside documents
	- Documents stored as binary data in a tree structure, allowing fast access to sub-elements



RedisGraph - It is a graph database build on Redis. Graphs are represented as sparse adjacency matrices
	- It uses Cypher as the query language
	- https://redis.io/commands/?group=graph



RedisTimeSeries - It adds a time series data structure to Redis.
	- High volume inserts, low latency reads
	- Query by start time and end-time
	- Aggregated queries
	- Downsampling / compaction for automatically updated aggregate time series
	- Each time series has labels (field value pairs) which will allows to query by labels
	- https://redis.io/commands/?group=timeseries




RedisBloom - It provides Bloom filters and other probabilistic data structures for Redis
	- A scalable Bloom filter, a cuckoo filter, a count-min sketch, and a top-k.
	- Bloom and cuckoo filters are used to determine, with a high degree of certainty, whether an element is a member of a set.
	- A count-min sketch is generally used to determine the frequency of events in a stream.
	- A top-k maintains a list of k most frequently seen items.
	- Each time series has labels (field value pairs) which will allows to query by labels
	- https://redis.io/docs/stack/bloom/commands/



RedisInsight - A powerful tool for visualizing and optimizing data in Redis or Redis Stack
	- making real-time application development easier
	- RedisInsight lets you do both GUI- and CLI-based interactions in a fully-featured
desktop GUI client

*/

/*
Installing Redis Stack (Use Docker - Easy and best way to install)
	- Install Docker Engine (https://docs.docker.com/engine/install/)
	- Install Redis Stack on Docker (https://redis.io/docs/stack/get-started/install/docker/)
 */
