// ***************************************************************************************************************************
// * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file *
// * distributed with this work for additional information regarding copyright ownership.  The ASF licenses this file        *
// * to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance            *
// * with the License.  You may obtain a copy of the License at                                                              *
// *                                                                                                                         *
// *  http://www.apache.org/licenses/LICENSE-2.0                                                                             *
// *                                                                                                                         *
// * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an  *
// * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the License for the        *
// * specific language governing permissions and limitations under the License.                                              *
// ***************************************************************************************************************************
package org.apache.ofbiz.juneau.resource;

import org.apache.juneau.html.annotation.HtmlDocConfig;
import org.apache.juneau.rest.BasicRestServletGroup;
import org.apache.juneau.rest.annotation.Rest;
import org.apache.juneau.rest.widget.ContentTypeMenuItem;
import org.apache.juneau.rest.widget.ThemeMenuItem;

/**
 * Sample REST resource showing how to implement a "router" resource page.
 *
 * <ul class='seealso'>
 * <li class='extlink'>{@source}
 * </ul>
 */
@Rest(path = "/*", title = "Root resources", description = "Example of a router resource page.", children = {
		EntityResource.class, ServiceResource.class }, debug = "true") // TODO Find better way of adding children resources, find programmatic way of doing the same.
@HtmlDocConfig(widgets = { ContentTypeMenuItem.class, ThemeMenuItem.class }, navlinks = { "options: ?method=OPTIONS",
		"$W{ContentTypeMenuItem}", "$W{ThemeMenuItem}",
		"source: $C{Source/gitHub}/org/apache/juneau/petstore/rest/$R{servletClassSimple}.java" }, aside = {
				"<div style='max-width:400px' class='text'>",
				"	<p>This is an example of a 'router' page that serves as a jumping-off point to child resources.</p>",
				"	<p>Resources can be nested arbitrarily deep through router pages.</p>",
				"	<p>Note the <span class='link'>options</span> link provided that lets you see the generated swagger doc for this page.</p>",
				"	<p>Also note the <span class='link'>sources</span> link on these pages to view the source code for the page.</p>",
				"	<p>All content on pages in the UI are serialized POJOs.  In this case, it's a serialized array of beans with 2 properties, 'name' and 'description'.</p>",
				"	<p>Other features (such as this aside) are added through annotations.</p>", "</div>" })

public class RootResource extends BasicRestServletGroup {
	private static final long serialVersionUID = 1L;
}