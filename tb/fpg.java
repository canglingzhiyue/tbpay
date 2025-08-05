package tb;

import android.content.res.XmlResourceParser;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamic.view.a;
import com.taobao.android.dinamic.view.b;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes5.dex */
public class fpg extends fpf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Constructor<?> f28089a;

    static {
        kge.a(-1640791566);
    }

    public fpg() {
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            this.f28089a = Class.forName("android.content.res.XmlBlock").getConstructor(byte[].class);
            this.f28089a.setAccessible(true);
        } catch (Exception e) {
            Log.e("Home.AssetParser", "Fail to get XmlBlock", e);
        }
    }

    @Override // tb.fpf
    public XmlPullParser a(String str, DinamicTemplate dinamicTemplate, b bVar) {
        if (this.f28089a != null && dinamicTemplate != null) {
            byte[] a2 = a(DTemplateManager.a(str).c(dinamicTemplate), bVar);
            if (a2 == null || a2.length == 0) {
                bVar.b().a(a.ERROR_CODE_TEMPLATE_FILE_EMPTY, "assert error");
            } else {
                String str2 = "File parser is applied: " + dinamicTemplate.name;
                try {
                    Object a3 = fpk.a(this.f28089a.newInstance(a2), "newParser", new Object[0]);
                    if (a3 instanceof XmlResourceParser) {
                        return (XmlResourceParser) a3;
                    }
                } catch (Exception e) {
                    bVar.b().a(a.ERROR_CODE_BYTE_TO_PARSER_ERROR, e.getMessage());
                }
                return null;
            }
        }
        return null;
    }
}
