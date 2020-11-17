/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.elasticsearch.model.v20170613;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.elasticsearch.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ValidateShrinkNodesRequest extends RoaAcsRequest<ValidateShrinkNodesResponse> {
	   

	private Boolean ignoreStatus;

	private String instanceId;

	private String nodeType;
	public ValidateShrinkNodesRequest() {
		super("elasticsearch", "2017-06-13", "ValidateShrinkNodes", "elasticsearche");
		setUriPattern("/openapi/instances/[InstanceId]/validate-shrink-nodes");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIgnoreStatus() {
		return this.ignoreStatus;
	}

	public void setIgnoreStatus(Boolean ignoreStatus) {
		this.ignoreStatus = ignoreStatus;
		if(ignoreStatus != null){
			putQueryParameter("ignoreStatus", ignoreStatus.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("InstanceId", instanceId);
		}
	}

	public String getNodeType() {
		return this.nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
		if(nodeType != null){
			putQueryParameter("nodeType", nodeType);
		}
	}

	@Override
	public Class<ValidateShrinkNodesResponse> getResponseClass() {
		return ValidateShrinkNodesResponse.class;
	}

}
