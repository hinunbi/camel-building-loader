package com.brm.biz;

import java.nio.charset.Charset;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileNameParser {

	private static final Logger logger = LoggerFactory.getLogger(FileNameParser.class);

	public void parse(String url, Exchange exchange) throws Exception {

		List<NameValuePair> params = URLEncodedUtils.parse(url, Charset.forName("UTF-8"));
		String fileName = "";
		for (NameValuePair pair : params) {
			if (pair.getName().equals("fileName")) {
				fileName = pair.getValue();
				break;
			}
		}

		exchange.getIn().setHeader(Exchange.FILE_NAME, fileName);
		logger.debug("Parsed file name : {}", fileName);
	}

}
