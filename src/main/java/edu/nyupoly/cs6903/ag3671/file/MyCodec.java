package edu.nyupoly.cs6903.ag3671.file;

import org.codehaus.preon.Codec;
import org.codehaus.preon.Codecs;
import org.codehaus.preon.DecodingException;


public class MyCodec <T extends BaseFileStructure> {
	
	private final Codec<T> codec;
	
	public MyCodec(Class<T> clazz) {
		codec = Codecs.create(clazz);
	}
	
	public byte[] encode(T obj) throws Exception {
		return Codecs.encode(obj, codec);
	}
	
	public T decode(byte[] arr) {
		
		try {
			return Codecs.decode(codec, arr);
		} catch (DecodingException e) {
			
		}
		
		return null;
	}
	
}
