package tb;

import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.Map;

/* loaded from: classes5.dex */
public class fwg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LruCache<String, byte[]> f28149a = new LruCache<>(500);

    /* loaded from: classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final fwg f28151a;

        static {
            kge.a(-2132280163);
            f28151a = new fwg();
        }

        public static /* synthetic */ fwg a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fwg) ipChange.ipc$dispatch("f04ce28", new Object[0]) : f28151a;
        }
    }

    static {
        kge.a(-915068982);
    }

    public static fwg a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fwg) ipChange.ipc$dispatch("f04ce28", new Object[0]) : b.a();
    }

    public byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return a().f28149a.get(str);
        }
        return null;
    }

    public void a(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a7c79", new Object[]{this, str, bArr});
        } else if (StringUtils.isEmpty(str) || bArr == null) {
        } else {
            a().f28149a.put(str, bArr);
        }
    }

    public void a(DXTemplateItem dXTemplateItem, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a95a98", new Object[]{this, dXTemplateItem, bArr});
        } else {
            a(a(dXTemplateItem), bArr);
        }
    }

    private String a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cf692af", new Object[]{this, dXTemplateItem});
        }
        if (dXTemplateItem != null) {
            return dXTemplateItem.b();
        }
        return null;
    }

    /* loaded from: classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public DXRuntimeContext f28150a;
        public boolean b;
        public DXTemplateItem c;
        public byte[] d;

        static {
            kge.a(1221611283);
            kge.a(-1390502639);
        }

        public a(DXRuntimeContext dXRuntimeContext, boolean z) {
            this.f28150a = dXRuntimeContext;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                DXTemplateItem c = this.f28150a.c();
                fuw.a("isMainTemplate:" + this.b + ":" + JSON.toJSONString(c) + " pack " + JSON.toJSONString(c.g));
                if (c != null && c.g != null && c.g.b != null) {
                    if (this.b) {
                        str = c.g.b.get("index.dx");
                    } else {
                        Map<String, String> map = c.g.b;
                        str = map.get(c.f11925a + "_" + c.b + "_index.dx");
                    }
                    if (StringUtils.isEmpty(str)) {
                        return;
                    }
                    fuw.a(str);
                    this.d = fwn.a().a(str, this.f28150a);
                    if (this.d == null) {
                        return;
                    }
                    fuw.a("isMainTemplate:" + this.b + ": 设置对应模版的js信息" + str);
                    fwg.a().a(this.c, this.d);
                }
            } catch (Throwable th) {
                com.taobao.android.dinamicx.exception.a.b(th);
            }
        }

        public byte[] a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this}) : this.d;
        }
    }
}
