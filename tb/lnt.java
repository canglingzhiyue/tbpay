package tb;

import android.graphics.Bitmap;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.Map;

/* loaded from: classes7.dex */
public class lnt extends lrr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f30750a = new a();

    static {
        kge.a(787646898);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "iconBackAnime.setBitmap";
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void a(JSONObject jSONObject, IJsBridgeService.a.InterfaceC0670a interfaceC0670a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a8e84a", new Object[]{this, jSONObject, interfaceC0670a});
        } else if (jSONObject == null) {
            interfaceC0670a.a("jsParams is empty");
            ldf.d("SetBitmapJsFeature", "jsParams is empty");
        } else {
            try {
                String string = jSONObject.getString("bitmapSession");
                Bitmap bitmap = (Bitmap) jSONObject.getObject("bitmapValue", Bitmap.class);
                if (!StringUtils.isEmpty(string) && bitmap != null) {
                    a.a(this.f30750a, string);
                    a.a(this.f30750a, bitmap);
                    interfaceC0670a.a((Map<String, Object>) null);
                    return;
                }
                interfaceC0670a.a("data is wrong");
                ldf.d("SetBitmapJsFeature", "setBitmap data is empty");
            } catch (Throwable th) {
                interfaceC0670a.a("set BitMap failed" + th.toString());
                ldf.d("SetBitmapJsFeature", "set BitMap failed" + th.toString());
            }
        }
    }

    public Bitmap a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("30dda510", new Object[]{this, str});
        }
        if (!StringUtils.equals(str, a.a(this.f30750a))) {
            return null;
        }
        return a.b(this.f30750a);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!StringUtils.equals(str, a.a(this.f30750a))) {
        } else {
            a.c(this.f30750a);
        }
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f30751a;
        private Bitmap b;

        static {
            kge.a(733195137);
        }

        public static /* synthetic */ Bitmap a(a aVar, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("f1d9923", new Object[]{aVar, bitmap});
            }
            aVar.b = bitmap;
            return bitmap;
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("228f6ab7", new Object[]{aVar}) : aVar.f30751a;
        }

        public static /* synthetic */ String a(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("92db166d", new Object[]{aVar, str});
            }
            aVar.f30751a = str;
            return str;
        }

        public static /* synthetic */ Bitmap b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("fce21828", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ void c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d3ff18b", new Object[]{aVar});
            } else {
                aVar.a();
            }
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f30751a = null;
            Bitmap bitmap = this.b;
            if (bitmap == null) {
                return;
            }
            bitmap.recycle();
            this.b = null;
        }
    }
}
