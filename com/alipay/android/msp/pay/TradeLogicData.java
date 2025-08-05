package com.alipay.android.msp.pay;

import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.framework.dynfun.DynDataWrapper;
import com.alipay.android.msp.network.model.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* loaded from: classes3.dex */
public class TradeLogicData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<MspContext> f4949a;
    private Header[] b;
    private RequestConfig e;
    private final DynDataWrapper<String> f;
    private final DynDataWrapper<String> g;
    private int c = 0;
    private int d = 1;
    private boolean h = false;
    private boolean i = false;
    private boolean j = true;
    private String k = "";
    private String l = "";
    private boolean m = false;

    public TradeLogicData(MspContext mspContext) {
        this.f4949a = new WeakReference<>(mspContext);
        int bizId = mspContext.getBizId();
        this.g = new DynDataWrapper<>(bizId, "trade_no", "");
        this.f = new DynDataWrapper<>(bizId, "sessionId", "");
    }

    public boolean hasTryLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("96c687b3", new Object[]{this})).booleanValue() : this.h;
    }

    public void setHasTryLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de01d87", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public int getRetryTimes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("58b4bfee", new Object[]{this})).intValue() : this.c;
    }

    public void updateRetryTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8642e", new Object[]{this});
        } else {
            this.c++;
        }
    }

    public boolean isIsSupportGzip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5665f340", new Object[]{this})).booleanValue() : this.j;
    }

    public void setIsSupportGzip(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e327850", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void setUac(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a743d8e7", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public int getUac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1615001b", new Object[]{this})).intValue() : this.d;
    }

    public String getSessionId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8ede3e", new Object[]{this}) : this.f.read();
    }

    public void setSessionId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648aa560", new Object[]{this, str});
        } else {
            this.f.write(str);
        }
    }

    public Header[] getLdcHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Header[]) ipChange.ipc$dispatch("81bca66e", new Object[]{this}) : this.b;
    }

    public void setLdcHeaders(Header[] headerArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bdb1e02", new Object[]{this, headerArr});
        } else if (headerArr == null) {
        } else {
            this.b = headerArr;
        }
    }

    public String getTradeNo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59e3704a", new Object[]{this}) : this.g.read();
    }

    public void setTradeNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98e21d4", new Object[]{this, str});
        } else {
            this.g.write(str);
        }
    }

    public void setLdcHeaders(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1e53ee", new Object[]{this, str});
        } else {
            this.b = new Header[]{new BasicHeader(MspNetConstants.Request.MSP_PARAM, str)};
        }
    }

    public RequestConfig getRequestConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RequestConfig) ipChange.ipc$dispatch("fdfdb155", new Object[]{this}) : this.e;
    }

    public void setRequestConfig(RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b50237", new Object[]{this, requestConfig});
        } else {
            this.e = requestConfig;
        }
    }

    public boolean isFirstRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("43089c14", new Object[]{this})).booleanValue() : this.i;
    }

    public void setFirstRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a7408c", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void setUserName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd26c09", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void setUserLogoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd0e4708", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public String getUserName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d328f00d", new Object[]{this}) : this.k;
    }

    public String getUserLogoUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("60b03a96", new Object[]{this}) : this.l;
    }

    public boolean isViChannelMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c55b94", new Object[]{this})).booleanValue() : this.m;
    }

    public void setIsViChannelMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f05b4c6", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public TradeLogicDataTransfer toTransfer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TradeLogicDataTransfer) ipChange.ipc$dispatch("33ebbcac", new Object[]{this});
        }
        TradeLogicDataTransfer tradeLogicDataTransfer = new TradeLogicDataTransfer();
        Header[] headerArr = this.b;
        if (headerArr != null) {
            TradeLogicDataTransfer.a(tradeLogicDataTransfer, (Header[]) Arrays.copyOf(headerArr, headerArr.length));
        }
        TradeLogicDataTransfer.a(tradeLogicDataTransfer, this.c);
        TradeLogicDataTransfer.b(tradeLogicDataTransfer, this.d);
        RequestConfig requestConfig = this.e;
        if (requestConfig != null) {
            TradeLogicDataTransfer.a(tradeLogicDataTransfer, requestConfig.m542clone());
        }
        TradeLogicDataTransfer.a(tradeLogicDataTransfer, this.g.read());
        TradeLogicDataTransfer.a(tradeLogicDataTransfer, this.h);
        TradeLogicDataTransfer.b(tradeLogicDataTransfer, this.i);
        TradeLogicDataTransfer.c(tradeLogicDataTransfer, this.j);
        TradeLogicDataTransfer.b(tradeLogicDataTransfer, this.f.read());
        TradeLogicDataTransfer.c(tradeLogicDataTransfer, this.k);
        TradeLogicDataTransfer.d(tradeLogicDataTransfer, this.l);
        TradeLogicDataTransfer.d(tradeLogicDataTransfer, this.m);
        return tradeLogicDataTransfer;
    }

    public void fromTransfer(TradeLogicDataTransfer tradeLogicDataTransfer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732f5dbf", new Object[]{this, tradeLogicDataTransfer});
            return;
        }
        setLdcHeaders(TradeLogicDataTransfer.a(tradeLogicDataTransfer));
        this.c = TradeLogicDataTransfer.b(tradeLogicDataTransfer);
        setUac(TradeLogicDataTransfer.c(tradeLogicDataTransfer));
        setRequestConfig(TradeLogicDataTransfer.d(tradeLogicDataTransfer));
        setTradeNo(TradeLogicDataTransfer.e(tradeLogicDataTransfer));
        setHasTryLogin(TradeLogicDataTransfer.f(tradeLogicDataTransfer));
        setFirstRequest(TradeLogicDataTransfer.g(tradeLogicDataTransfer));
        setIsSupportGzip(TradeLogicDataTransfer.h(tradeLogicDataTransfer));
        setSessionId(TradeLogicDataTransfer.i(tradeLogicDataTransfer));
        setUserName(TradeLogicDataTransfer.j(tradeLogicDataTransfer));
        setUserLogoUrl(TradeLogicDataTransfer.k(tradeLogicDataTransfer));
        setIsViChannelMode(TradeLogicDataTransfer.l(tradeLogicDataTransfer));
    }

    /* loaded from: classes3.dex */
    public static class TradeLogicDataTransfer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Header[] f4950a;
        private RequestConfig d;
        private int b = 0;
        private int c = 1;
        private String i = "";
        private boolean e = false;
        private boolean f = false;
        private boolean g = true;
        private String h = "";
        private String j = "";
        private String k = "";
        private boolean l = false;

        public static /* synthetic */ int a(TradeLogicDataTransfer tradeLogicDataTransfer, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("78077ceb", new Object[]{tradeLogicDataTransfer, new Integer(i)})).intValue();
            }
            tradeLogicDataTransfer.b = i;
            return i;
        }

        public static /* synthetic */ RequestConfig a(TradeLogicDataTransfer tradeLogicDataTransfer, RequestConfig requestConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RequestConfig) ipChange.ipc$dispatch("b6bd086b", new Object[]{tradeLogicDataTransfer, requestConfig});
            }
            tradeLogicDataTransfer.d = requestConfig;
            return requestConfig;
        }

        public static /* synthetic */ String a(TradeLogicDataTransfer tradeLogicDataTransfer, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("43dca4cb", new Object[]{tradeLogicDataTransfer, str});
            }
            tradeLogicDataTransfer.i = str;
            return str;
        }

        public static /* synthetic */ boolean a(TradeLogicDataTransfer tradeLogicDataTransfer, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7807bccd", new Object[]{tradeLogicDataTransfer, new Boolean(z)})).booleanValue();
            }
            tradeLogicDataTransfer.e = z;
            return z;
        }

        public static /* synthetic */ Header[] a(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Header[]) ipChange.ipc$dispatch("a9293dc1", new Object[]{tradeLogicDataTransfer}) : tradeLogicDataTransfer.f4950a;
        }

        public static /* synthetic */ Header[] a(TradeLogicDataTransfer tradeLogicDataTransfer, Header[] headerArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Header[]) ipChange.ipc$dispatch("c3253df1", new Object[]{tradeLogicDataTransfer, headerArr});
            }
            tradeLogicDataTransfer.f4950a = headerArr;
            return headerArr;
        }

        public static /* synthetic */ int b(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ffd1169f", new Object[]{tradeLogicDataTransfer})).intValue() : tradeLogicDataTransfer.b;
        }

        public static /* synthetic */ int b(TradeLogicDataTransfer tradeLogicDataTransfer, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fa5231ca", new Object[]{tradeLogicDataTransfer, new Integer(i)})).intValue();
            }
            tradeLogicDataTransfer.c = i;
            return i;
        }

        public static /* synthetic */ String b(TradeLogicDataTransfer tradeLogicDataTransfer, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b14961ea", new Object[]{tradeLogicDataTransfer, str});
            }
            tradeLogicDataTransfer.h = str;
            return str;
        }

        public static /* synthetic */ boolean b(TradeLogicDataTransfer tradeLogicDataTransfer, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fa5271ac", new Object[]{tradeLogicDataTransfer, new Boolean(z)})).booleanValue();
            }
            tradeLogicDataTransfer.f = z;
            return z;
        }

        public static /* synthetic */ int c(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e2fcc9e0", new Object[]{tradeLogicDataTransfer})).intValue() : tradeLogicDataTransfer.c;
        }

        public static /* synthetic */ String c(TradeLogicDataTransfer tradeLogicDataTransfer, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1eb61f09", new Object[]{tradeLogicDataTransfer, str});
            }
            tradeLogicDataTransfer.j = str;
            return str;
        }

        public static /* synthetic */ boolean c(TradeLogicDataTransfer tradeLogicDataTransfer, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7c9d268b", new Object[]{tradeLogicDataTransfer, new Boolean(z)})).booleanValue();
            }
            tradeLogicDataTransfer.g = z;
            return z;
        }

        public static /* synthetic */ RequestConfig d(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RequestConfig) ipChange.ipc$dispatch("94c6a2a9", new Object[]{tradeLogicDataTransfer}) : tradeLogicDataTransfer.d;
        }

        public static /* synthetic */ String d(TradeLogicDataTransfer tradeLogicDataTransfer, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8c22dc28", new Object[]{tradeLogicDataTransfer, str});
            }
            tradeLogicDataTransfer.k = str;
            return str;
        }

        public static /* synthetic */ boolean d(TradeLogicDataTransfer tradeLogicDataTransfer, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fee7db6a", new Object[]{tradeLogicDataTransfer, new Boolean(z)})).booleanValue();
            }
            tradeLogicDataTransfer.l = z;
            return z;
        }

        public static /* synthetic */ String e(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("880cd011", new Object[]{tradeLogicDataTransfer}) : tradeLogicDataTransfer.i;
        }

        public static /* synthetic */ boolean f(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8c7fe3b4", new Object[]{tradeLogicDataTransfer})).booleanValue() : tradeLogicDataTransfer.e;
        }

        public static /* synthetic */ boolean g(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6fab96f5", new Object[]{tradeLogicDataTransfer})).booleanValue() : tradeLogicDataTransfer.f;
        }

        public static /* synthetic */ boolean h(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("52d74a36", new Object[]{tradeLogicDataTransfer})).booleanValue() : tradeLogicDataTransfer.g;
        }

        public static /* synthetic */ String i(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("11792b8d", new Object[]{tradeLogicDataTransfer}) : tradeLogicDataTransfer.h;
        }

        public static /* synthetic */ String j(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("73d4426c", new Object[]{tradeLogicDataTransfer}) : tradeLogicDataTransfer.j;
        }

        public static /* synthetic */ String k(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d62f594b", new Object[]{tradeLogicDataTransfer}) : tradeLogicDataTransfer.k;
        }

        public static /* synthetic */ boolean l(TradeLogicDataTransfer tradeLogicDataTransfer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("df86173a", new Object[]{tradeLogicDataTransfer})).booleanValue() : tradeLogicDataTransfer.l;
        }
    }
}
