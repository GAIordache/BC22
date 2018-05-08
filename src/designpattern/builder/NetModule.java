package designpattern.builder;

public class NetModule {
	private int mTimeOut;
	private int mMaxPacketLen;
	
	NetModule() {

	}

	public int getTimeOut() {
		return mTimeOut;
	}

	public int getMaxPacketLen() {
		return mMaxPacketLen;
	}
	
	public static class Builder {
		private NetModule nm = new NetModule();
		
		public Builder setTimeout(int pTimeout) {
			nm.mTimeOut = pTimeout;
			return this;
		}
		
		public Builder setMaxPackLen(int pMax) {
			nm.mMaxPacketLen = pMax;
			return this;
		}
		
		public NetModule build() {
			return nm;
		}
	}

}
