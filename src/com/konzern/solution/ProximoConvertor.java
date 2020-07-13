/**
 * 
 */
package com.konzern.solution;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * @author Konzerntechies
 *
 */
public class ProximoConvertor {
	
	
	private String ascii = "ASCII";
	private String DEFAULT_ENCODING = ascii;
	
	/**
	 * 
	 * @param data
	 * @param offset
	 * @param length
	 * @param characterEncoding
	 * @return
	 * @throws CharacterCodingException
	 */
	public String convertByteToString(byte[] data, int offset, int length, String characterEncoding) throws CharacterCodingException {
		ByteBuffer buffer = ByteBuffer.wrap(data, offset, length);
		Charset charset = Charset.forName(characterEncoding);
		CharsetDecoder decoder = charset.newDecoder();
		CharBuffer cBuffer = null;
			cBuffer = decoder.decode(buffer);
		return cBuffer.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		ProximoConvertor convertor = new ProximoConvertor();
		byte[] input = { -61, -106, -107, -94, -92, -108, -123, -103, -122, -123, -124, 64, -46, -106, -87, -120, -119,
				-110, -106, -124, -123, 64, -39, -123, -121, -119, -106, -107, -127, -109, 64, -42, -122, -122, -119,
				-125, -123 };
//		byte[] input = new byte[1];
		try {
			System.out.println(convertor.convertByteToString(input, 0, 11, "CP1047"));
		} catch (CharacterCodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println(System.currentTimeMillis()- startTime);
		}

	}

}
