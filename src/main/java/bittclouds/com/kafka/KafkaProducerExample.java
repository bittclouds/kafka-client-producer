package bittclouds.com.kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import bittclouds.com.kafka.model.SampleModel;

public class KafkaProducerExample {
	public static void main(String[] args) {
		Properties props = new Properties();
		props.put("bootstrap.servers", "localhost:9092");
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		
		
		KafkaProducer<String, String> myProducer = new KafkaProducer<String, String>(props); 
		try {
			String s = "abcdefghijklmnopqrstuvxwyzABCDEFGHIJKLMNOPQRSTUVXWYZabcdefghijklmnopqrstuvxwyzABCDEFGHIJKLMNOPQRSTUVXWYZabcdefghijklmnopqrstuvxwyzABCDEFGHIJKLMNOPQRSTUVXWYZabcdefghijklmnopqrstuvxwyzABCDEFGHIJKLMNOPQRSTUVXWYZabcdefghijklmnopqrstuvxwyzABCDEFGHIJKLMNOPQRSTUVXWYZabcdefghijklmnopqrstuvxwyzABCDEFGHIJKLMNOPQRSTUVXWYZabcdefghijklmnopqrstuvxwyzABCDEFGHIJKLMNOPQRSTUVXWYZabcdefghijklmnopqrstuvxwyzABCDEFGHIJKLMNOPQRSTUVXWYZ";
			
			SampleModel record = new SampleModel(
					s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, 
					s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, 
					s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, 
					s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, s, 
					s, s );
			
			for (long i = 0; i < 10; i++) {
				System.out.println(i);
				myProducer.send(new ProducerRecord<String, String>("my_topic", Long.toString(i), record.toString() ));
			}
		} catch (Exception e) {
			System.err.println(e.getStackTrace());
		} finally {
			myProducer.close();
		}
	}

}
