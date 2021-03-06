/**
*
* *****************************************************************************
*
* Copyright (C) 2020 Stratus. All rights reserved.
* 
* \file		Utils.java
* 
* Defines Utils Class and its operations.
* 
******************************************************************************
*/
package hello;


import java.net.URLEncoder;

public class Utils
{
	public enum StatusCode
	{
		SUCCESS,
		FAILED,
		RESOURCE_CREATED,
		INVALID_CREDENTIALS,
		INVALID_PARAMETERS,
		PERMISSION_DENIED,
		OBJECT_NOT_FOUND,
		ALREADY_EXISTS,
		CONNECTION_ERROR,
		MAX_CONNECTIONS_REACHED,
		FILE_NOT_FOUND,		
		UNKNOWN,
		CONTENT_MISMATCH,
		BAD_REQUEST,
	};

	enum RequestType
	{
		eGet,
		ePost,
		ePut,
		eDelete
	};

	/*
	 * convertWhiteSpaceToValidString
	 * params : string
	 * returns : resultant string
	 * 
	 */
	public static String convertWhiteSpaceToValidString(String string)
	{
		String result = string;
		try
		{
			result = URLEncoder.encode(string, "UTF-8").replaceAll(
					"\\+", "%20");
		}
		catch(Exception e)
		{
		}
		return result;
	}
}