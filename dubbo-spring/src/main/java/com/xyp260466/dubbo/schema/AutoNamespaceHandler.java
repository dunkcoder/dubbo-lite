/**
 * Copyright 2002-2016 xiaoyuepeng
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * @author xiaoyuepeng <xyp260466@163.com>
 */
package com.xyp260466.dubbo.schema;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by xyp on 16-5-9.
 */
public class AutoNamespaceHandler extends NamespaceHandlerSupport {
    private static final Logger logger = Logger.getLogger(AutoNamespaceHandler.class);

    public void init() {

        logger.info("Initialize Dubbo Namespace Handler.");

        registerBeanDefinitionParser("annotation-driven", new AutoBeanDefinitionParser());
    }
}
