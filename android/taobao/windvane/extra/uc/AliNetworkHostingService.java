package android.taobao.windvane.extra.uc;

import android.content.Context;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.uc.interfaces.EventHandler;
import android.taobao.windvane.extra.uc.interfaces.IRequest;
import android.taobao.windvane.thread.WVThreadPool;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import anetwork.channel.IBodyHandler;
import anetwork.channel.Request;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.INetworkHostingService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class AliNetworkHostingService extends INetworkHostingService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int NETWORK_TYPE_TAOBAO_NET = 2;
    private static final String NETWORK_VERSION = "1.0.0.0";
    public static final int NET_ERROR_FALLBACK = -2104;
    private static final String TAG = "alinetwork-service";
    private final AliNetworkDecider mAliDecider = new AliNetworkDecider();
    private final Context mContext;

    /* loaded from: classes2.dex */
    public interface NetworkErrorCode {
        public static final int ERROR_LOOKUP = -2;
        public static final int READ_ERROR_ILLEGAL_STATE = -45;
        public static final int READ_ERROR_IO = -44;
        public static final int READ_ERROR_PARSE = -43;
        public static final int READ_ERROR_SOCKET_ERROR = -47;
        public static final int READ_ERROR_SOCKET_TIMEOUT = -46;
    }

    /* loaded from: classes2.dex */
    public interface NetworkType {
        public static final int NETWORK_TYPE_DEGRADABLE_NETWORK = 2;
        public static final int NETWORK_TYPE_HTTP_NETWORK = 0;
        public static final int NETWORK_TYPE_SPDY_NETWORK = 1;
    }

    /* loaded from: classes2.dex */
    public interface OldRequestType {
        public static final int REQUEST_CSS = 3;
        public static final int REQUEST_FAVICON = 13;
        public static final int REQUEST_FONTRESOURCE = 5;
        public static final int REQUEST_IMAGE = 6;
        public static final int REQUEST_JS = 4;
        public static final int REQUEST_MAINFRAME = 0;
        public static final int REQUEST_MEDIA = 8;
        public static final int REQUEST_OBJECT = 7;
        public static final int REQUEST_PREFENDER = 12;
        public static final int REQUEST_PREFETCH = 11;
        public static final int REQUEST_SHAREDWORKER = 10;
        public static final int REQUEST_SUBFRAME = 1;
        public static final int REQUEST_SUBRESOURCE = 2;
        public static final int REQUEST_TEXTTRACK = 15;
        public static final int REQUEST_UNSPECIFIED = 16;
        public static final int REQUEST_WORKER = 9;
        public static final int REQUEST_XHR = 14;
    }

    /* loaded from: classes2.dex */
    public interface ResourceType {
        public static final int FAVICON = 12;
        public static final int FONT_RESOURCE = 5;
        public static final int IMAGE = 4;
        public static final int MAIN_FRAME = 0;
        public static final int MEDIA = 8;
        public static final int OBJECT = 7;
        public static final int PREFETCH = 11;
        public static final int SCRIPT = 3;
        public static final int SHARED_WORKER = 10;
        public static final int STYLE_SHEET = 2;
        public static final int SUB_FRAME = 1;
        public static final int SUB_RESOURCE = 6;
        public static final int WORKER = 9;
        public static final int XHR = 13;
    }

    static {
        kge.a(952211113);
    }

    private static int convertToOldRequestType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3281905f", new Object[]{new Integer(i)})).intValue();
        }
        int i2 = 2;
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 6;
        }
        if (i != 6) {
            i2 = 13;
            if (i != 12) {
                if (i == 13) {
                    return 14;
                }
                return i;
            }
        }
        return i2;
    }

    public static /* synthetic */ Object ipc$super(AliNetworkHostingService aliNetworkHostingService, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.uc.webview.export.extension.INetworkHostingService
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 2;
    }

    @Override // com.uc.webview.export.extension.INetworkHostingService
    public String version() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("deb50921", new Object[]{this}) : "1.0.0.0";
    }

    public static /* synthetic */ int access$000(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ddeb5a5f", new Object[]{new Integer(i)})).intValue() : convertToOldRequestType(i);
    }

    public static /* synthetic */ Context access$100(AliNetworkHostingService aliNetworkHostingService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("dcdf8878", new Object[]{aliNetworkHostingService}) : aliNetworkHostingService.mContext;
    }

    public AliNetworkHostingService(Context context) {
        this.mContext = context;
    }

    @Override // com.uc.webview.export.extension.INetworkHostingService
    public INetworkHostingService.ITransaction createTransaction(int i, String str, WebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INetworkHostingService.ITransaction) ipChange.ipc$dispatch("af3ec3f0", new Object[]{this, new Integer(i), str, webView});
        }
        if (!shouldUseTaobaoNetwork(str)) {
            return null;
        }
        return new NetworkTransaction(webView, i, str);
    }

    private boolean shouldUseTaobaoNetwork(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16ab0441", new Object[]{this, str})).booleanValue() : 2 == this.mAliDecider.chooseNetwork(str);
    }

    /* loaded from: classes2.dex */
    public class NetworkTransaction extends INetworkHostingService.ITransaction {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private AliNetworkAdapterNew mAliNetwork;
        private INetworkHostingService.IDelegate mDelegate;
        private String mMethod;
        private IRequest mRequest;
        private int mRequestFlag;
        private final int mRequestType;
        private INetworkHostingService.IUploadStream mUploadStream;
        private final String mUrl;
        private final Map<String, String> mHeaders = new ConcurrentHashMap();
        private final Map<String, String> mExtraInfo = new ConcurrentHashMap();

        static {
            kge.a(23282123);
        }

        public static /* synthetic */ Object ipc$super(NetworkTransaction networkTransaction, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ INetworkHostingService.IDelegate access$200(NetworkTransaction networkTransaction) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (INetworkHostingService.IDelegate) ipChange.ipc$dispatch("536f84bc", new Object[]{networkTransaction}) : networkTransaction.mDelegate;
        }

        public NetworkTransaction(WebView webView, int i, String str) {
            this.mRequestType = AliNetworkHostingService.access$000(i);
            this.mUrl = str;
            boolean z = i == 0;
            AliNetworkAdapterNew aliNetworkAdapterNew = null;
            WVUCWebView wVUCWebView = webView instanceof WVUCWebView ? (WVUCWebView) webView : null;
            if (wVUCWebView != null && z) {
                this.mAliNetwork = new AliNetworkAdapterNew(AliNetworkHostingService.access$100(AliNetworkHostingService.this), wVUCWebView.overrideBizId != null ? wVUCWebView.overrideBizId : wVUCWebView.bizCode, wVUCWebView);
                this.mAliNetwork.setId(wVUCWebView);
                wVUCWebView.setAliNetwork(this.mAliNetwork);
            } else {
                this.mAliNetwork = wVUCWebView != null ? wVUCWebView.getAliNetwork() : aliNetworkAdapterNew;
            }
            if (this.mAliNetwork == null) {
                if (j.commonConfig.cx && wVUCWebView != null) {
                    this.mAliNetwork = new AliNetworkAdapterNew(AliNetworkHostingService.access$100(AliNetworkHostingService.this), wVUCWebView.overrideBizId != null ? wVUCWebView.overrideBizId : wVUCWebView.bizCode, wVUCWebView);
                    this.mAliNetwork.setId(wVUCWebView);
                    wVUCWebView.setAliNetwork(this.mAliNetwork);
                    return;
                }
                this.mAliNetwork = new AliNetworkAdapterNew(AliNetworkHostingService.access$100(AliNetworkHostingService.this));
            }
        }

        @Override // com.uc.webview.export.extension.INetworkHostingService.ITransaction
        public void start() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
                return;
            }
            INetworkHostingService.IDelegate iDelegate = this.mDelegate;
            if (iDelegate == null) {
                m.e(AliNetworkHostingService.TAG, "start failed: delegate is null");
                return;
            }
            EventHandlerAdapter eventHandlerAdapter = new EventHandlerAdapter(this.mUrl, iDelegate);
            IRequest formatRequest = this.mAliNetwork.formatRequest(eventHandlerAdapter, this.mUrl, this.mMethod, false, this.mHeaders, this.mExtraInfo, null, null, 0L, this.mRequestType, 0);
            eventHandlerAdapter.setRequest(formatRequest);
            eventHandlerAdapter.setResourceType(this.mRequestType);
            setupUploadStream(formatRequest);
            if (formatRequest == null || !this.mAliNetwork.sendRequest(formatRequest) || ((str = this.mMethod) != null && str.equalsIgnoreCase("OPTIONS"))) {
                m.e(AliNetworkHostingService.TAG, "start failed: send failed req=" + formatRequest);
                WVThreadPool.getInstance().execute(new Runnable() { // from class: android.taobao.windvane.extra.uc.AliNetworkHostingService.NetworkTransaction.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            NetworkTransaction.access$200(NetworkTransaction.this).onError(AliNetworkHostingService.NET_ERROR_FALLBACK, "req send failed");
                        }
                    }
                });
                return;
            }
            this.mRequest = formatRequest;
        }

        @Override // com.uc.webview.export.extension.INetworkHostingService.ITransaction
        public void cancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
                return;
            }
            IRequest iRequest = this.mRequest;
            if (iRequest == null) {
                return;
            }
            iRequest.cancel();
        }

        @Override // com.uc.webview.export.extension.INetworkHostingService.ITransaction
        public void setMethod(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
            } else {
                this.mMethod = str;
            }
        }

        @Override // com.uc.webview.export.extension.INetworkHostingService.ITransaction
        public void setHeader(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("821380aa", new Object[]{this, str, str2});
            } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            } else {
                if (this.mHeaders.containsKey(str)) {
                    synchronized (this.mHeaders) {
                        str2 = this.mHeaders.get(str) + "; " + str2;
                    }
                }
                this.mHeaders.put(str, str2);
            }
        }

        @Override // com.uc.webview.export.extension.INetworkHostingService.ITransaction
        public void setExtraInfo(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3768cb7", new Object[]{this, str, str2});
            } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            } else {
                this.mExtraInfo.put(str, str2);
            }
        }

        @Override // com.uc.webview.export.extension.INetworkHostingService.ITransaction
        public void setRequestFlags(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c81348e2", new Object[]{this, new Integer(i)});
            } else {
                this.mRequestFlag = i;
            }
        }

        @Override // com.uc.webview.export.extension.INetworkHostingService.ITransaction
        public void setDelegate(INetworkHostingService.IDelegate iDelegate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1971691", new Object[]{this, iDelegate});
            } else {
                this.mDelegate = iDelegate;
            }
        }

        @Override // com.uc.webview.export.extension.INetworkHostingService.ITransaction
        public void setUploadStream(INetworkHostingService.IUploadStream iUploadStream) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1e0ee11", new Object[]{this, iUploadStream});
            } else {
                this.mUploadStream = iUploadStream;
            }
        }

        private void setupUploadStream(IRequest iRequest) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fec8e57", new Object[]{this, iRequest});
            } else if (this.mUploadStream == null) {
            } else {
                Request request = null;
                if (iRequest instanceof AliRequestAdapter) {
                    request = ((AliRequestAdapter) iRequest).getAliRequest();
                } else if (iRequest instanceof MTopSSRRequest) {
                    m.e(AliNetworkHostingService.TAG, "setupUploadStream: mtop has upload data");
                } else {
                    m.e(AliNetworkHostingService.TAG, "setupUploadStream: unsupported request type " + iRequest);
                }
                if (request == null) {
                    return;
                }
                request.setBodyHandler(new BodyHandlerAdapter(this.mUploadStream));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class BodyHandlerAdapter implements IBodyHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int BUFFER_SIZE = 4096;
        private boolean mIsCompleted = false;
        private final INetworkHostingService.IUploadStream mOriginalStream;
        private INetworkHostingService.IUploadStream mWorkingStream;

        static {
            kge.a(-1735251742);
            kge.a(-1445981459);
        }

        public BodyHandlerAdapter(INetworkHostingService.IUploadStream iUploadStream) {
            this.mOriginalStream = iUploadStream;
            this.mWorkingStream = this.mOriginalStream;
        }

        @Override // anetwork.channel.IBodyHandler
        public synchronized int read(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue();
            }
            if (this.mWorkingStream == null) {
                this.mOriginalStream.rewind();
                this.mWorkingStream = this.mOriginalStream;
            }
            int length = bArr.length;
            if (length >= 4096) {
                length = 4096;
            }
            byte[] bArr2 = new byte[length];
            int read = this.mWorkingStream.read(bArr2);
            if (read == 0) {
                this.mIsCompleted = true;
                this.mWorkingStream = null;
            } else if (read > 0) {
                System.arraycopy(bArr2, 0, bArr, 0, read);
            }
            return read;
        }

        @Override // anetwork.channel.IBodyHandler
        public boolean isCompleted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8c6bb44c", new Object[]{this})).booleanValue();
            }
            boolean z = this.mIsCompleted;
            if (!z) {
                return z;
            }
            this.mIsCompleted = false;
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class EventHandlerAdapter implements EventHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final INetworkHostingService.IDelegate mDelegate;
        private int mNetworkEngin;
        private IRequest mRequest;
        private int mResourceType;
        private String mStatusLine;
        private final String mUrl;

        static {
            kge.a(-1615381692);
            kge.a(-2067286617);
        }

        @Override // android.taobao.windvane.extra.uc.interfaces.EventHandler
        public boolean isSynchronous() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b41964ca", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public EventHandlerAdapter(String str, INetworkHostingService.IDelegate iDelegate) {
            this.mUrl = str;
            this.mDelegate = iDelegate;
        }

        @Override // android.taobao.windvane.extra.uc.interfaces.EventHandler
        public void status(int i, int i2, int i3, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f380fd4", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), str});
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("HTTP/");
            sb.append(2 == i ? "2.0" : "1.1");
            sb.append(" ");
            sb.append(i3);
            sb.append(" ");
            sb.append(str);
            this.mStatusLine = sb.toString();
        }

        @Override // android.taobao.windvane.extra.uc.interfaces.EventHandler
        public void headers(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78ea67a9", new Object[]{this, obj});
                return;
            }
            throw new RuntimeException("UNSUPPORT");
        }

        @Override // android.taobao.windvane.extra.uc.interfaces.EventHandler
        public void headers(Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1d23ed8", new Object[]{this, map});
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            m.b(AliNetworkHostingService.TAG, "[onResponseCode] in. url=" + this.mUrl + ",headers=" + map);
            String str = null;
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getKey().equalsIgnoreCase("content-encoding") && entry.getValue() != null && entry.getValue().get(0).equalsIgnoreCase("gzip")) {
                    m.b(AliNetworkHostingService.TAG, "[onResponseCode] has gzip header. url=" + this.mUrl);
                } else {
                    for (String str2 : entry.getValue()) {
                        if (entry.getKey() == null) {
                            str = entry.getValue().get(0);
                        } else {
                            arrayList.add(entry.getKey());
                            arrayList2.add(str2);
                        }
                    }
                }
            }
            if (!StringUtils.isEmpty(str)) {
                this.mStatusLine = str;
            }
            m.b(AliNetworkHostingService.TAG, "[onResponseCode] in2.");
            this.mDelegate.onResponseReceived(this.mStatusLine, (String[]) arrayList.toArray(new String[arrayList.size()]), (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            m.b(AliNetworkHostingService.TAG, "[onResponseCode] in3.");
        }

        @Override // android.taobao.windvane.extra.uc.interfaces.EventHandler
        public void data(byte[] bArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3fee4b", new Object[]{this, bArr, new Integer(i)});
            } else {
                this.mDelegate.onDataReceived(bArr, i);
            }
        }

        @Override // android.taobao.windvane.extra.uc.interfaces.EventHandler
        public void endData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eef712c", new Object[]{this});
            } else {
                this.mDelegate.onFinished();
            }
        }

        @Override // android.taobao.windvane.extra.uc.interfaces.EventHandler
        public void error(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89556f1e", new Object[]{this, new Integer(i), str});
            } else {
                this.mDelegate.onError(i, str);
            }
        }

        @Override // android.taobao.windvane.extra.uc.interfaces.EventHandler
        public void setRequest(IRequest iRequest) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e61966", new Object[]{this, iRequest});
            } else {
                this.mRequest = iRequest;
            }
        }

        @Override // android.taobao.windvane.extra.uc.interfaces.EventHandler
        public int getResourceType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("14b68858", new Object[]{this})).intValue() : this.mResourceType;
        }

        @Override // android.taobao.windvane.extra.uc.interfaces.EventHandler
        public void setResourceType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5db103b2", new Object[]{this, new Integer(i)});
            } else {
                this.mResourceType = i;
            }
        }
    }
}
