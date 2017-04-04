/**
 * Copyright &copy; 2016-2020 iwechat All rights reserved.
 */
package com.wechat.common.supcan.freeform;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.wechat.common.supcan.common.Common;
import com.wechat.common.supcan.common.properties.Properties;

/**
 * 硕正FreeForm
 * @author WangZhen
 * @version 2017-11-04
 */
@XStreamAlias("FreeForm")
public class FreeForm extends Common {

	public FreeForm() {
		super();
	}
	
	public FreeForm(Properties properties) {
		this();
		this.properties = properties;
	}
	
}
