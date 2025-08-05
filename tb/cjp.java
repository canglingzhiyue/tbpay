package tb;

import android.content.Context;
import com.alipay.biometrics.common.proguard.INotProguard;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.verifyidentity.rpc.IRpcService;
import com.alipay.vi.android.phone.mrpc.core.Config;
import com.alipay.vi.android.phone.mrpc.core.HttpManager;
import com.alipay.vi.android.phone.mrpc.core.RpcFactory;
import com.alipay.vi.android.phone.mrpc.core.RpcParams;
import com.alipay.vi.android.phone.mrpc.core.Transport;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* loaded from: classes3.dex */
public class cjp implements INotProguard, IRpcService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RpcFactory b;
    private Context c;

    /* renamed from: a  reason: collision with root package name */
    private String f26316a = "IRpcServiceZLZImpl";
    private String d = "";
    private String e = "";
    private String f = "";

    static {
        kge.a(-2018905169);
    }

    public static /* synthetic */ Context a(cjp cjpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f477b47", new Object[]{cjpVar}) : cjpVar.c;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    @Override // com.alipay.mobile.verifyidentity.rpc.IRpcService
    public <T> T getRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("eba1321b", new Object[]{this, cls});
        }
        this.b = new RpcFactory(b());
        this.b.setContext(this.c);
        return (T) this.b.getRpcProxy(cls);
    }

    @Override // com.alipay.mobile.verifyidentity.rpc.IRpcService
    public void setGW(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523025e3", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.c = context;
        }
    }

    private List<Header> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicHeader(HeaderConstant.HEADER_KEY_WORKSPACE_ID, this.e));
        arrayList.add(new BasicHeader("appId", this.f));
        arrayList.add(new BasicHeader(HeaderConstant.HEADER_KEY_OPERATION_TYPE, "com.zoloz.zhub.factor.next"));
        return arrayList;
    }

    private Config b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("ea8d48fb", new Object[]{this});
        }
        final RpcParams rpcParams = new RpcParams();
        rpcParams.setGwUrl(this.d);
        rpcParams.setHeaders(a());
        return new Config() { // from class: tb.cjp.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public String getAppKey() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("49079005", new Object[]{this}) : "";
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public String sign(Context context, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("2ca88008", new Object[]{this, context, str, str2}) : "";
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public String getUrl() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("de8f0660", new Object[]{this}) : rpcParams.getGwUrl();
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public Transport getTransport() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Transport) ipChange2.ipc$dispatch("36cb0cc1", new Object[]{this}) : HttpManager.getInstance(getApplicationContext());
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public RpcParams getRpcParams() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (RpcParams) ipChange2.ipc$dispatch("cc287401", new Object[]{this}) : rpcParams;
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public Context getApplicationContext() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Context) ipChange2.ipc$dispatch("c5c75d34", new Object[]{this}) : cjp.a(cjp.this).getApplicationContext();
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public boolean isGzip() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("8b75982f", new Object[]{this})).booleanValue() : rpcParams.isGzip();
            }
        };
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }
}
