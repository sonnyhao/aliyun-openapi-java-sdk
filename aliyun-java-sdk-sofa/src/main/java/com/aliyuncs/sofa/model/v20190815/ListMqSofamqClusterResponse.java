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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ListMqSofamqClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMqSofamqClusterResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String appkey;

		private String cluster;

		private String clusterType;

		private String deployMode;

		private String gmtCreate;

		private String gmtModified;

		private Long id;

		private String ldcMode;

		private String remark;

		public String getAppkey() {
			return this.appkey;
		}

		public void setAppkey(String appkey) {
			this.appkey = appkey;
		}

		public String getCluster() {
			return this.cluster;
		}

		public void setCluster(String cluster) {
			this.cluster = cluster;
		}

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public String getDeployMode() {
			return this.deployMode;
		}

		public void setDeployMode(String deployMode) {
			this.deployMode = deployMode;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getLdcMode() {
			return this.ldcMode;
		}

		public void setLdcMode(String ldcMode) {
			this.ldcMode = ldcMode;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}
	}

	@Override
	public ListMqSofamqClusterResponse getInstance(UnmarshallerContext context) {
		return	ListMqSofamqClusterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
