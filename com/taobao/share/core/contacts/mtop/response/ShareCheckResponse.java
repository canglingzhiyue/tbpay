package com.taobao.share.core.contacts.mtop.response;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class ShareCheckResponse extends BaseOutDo implements Serializable {
    public ShareCheckResponseData data;

    static {
        kge.a(1724000096);
        kge.a(1028243835);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public ShareCheckResponseData mo2429getData() {
        return this.data;
    }

    public void setData(ShareCheckResponseData shareCheckResponseData) {
        this.data = shareCheckResponseData;
    }

    /* loaded from: classes8.dex */
    public static class ShareCheckResponseData implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean canSend;
        public String noSendCode;
        public String noSendMsg;
        public String sendUrl;

        static {
            kge.a(-1964118920);
            kge.a(1028243835);
        }

        public boolean isCanSend() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3c40079", new Object[]{this})).booleanValue() : this.canSend;
        }

        public void setCanSend(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69595c37", new Object[]{this, new Boolean(z)});
            } else {
                this.canSend = z;
            }
        }

        public String getNoSendCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("164e40d", new Object[]{this}) : this.noSendCode;
        }

        public void setNoSendCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2212509", new Object[]{this, str});
            } else {
                this.noSendCode = str;
            }
        }

        public String getNoSendMsg() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b6ad517", new Object[]{this}) : this.noSendMsg;
        }

        public void setNoSendMsg(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e42d89a7", new Object[]{this, str});
            } else {
                this.noSendMsg = str;
            }
        }

        public String getSendUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b34d3708", new Object[]{this}) : this.sendUrl;
        }

        public void setSendUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd5d32d6", new Object[]{this, str});
            } else {
                this.sendUrl = str;
            }
        }
    }
}
