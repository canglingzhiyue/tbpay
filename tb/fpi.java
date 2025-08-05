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
public class fpi extends fpf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Constructor<?> f28092a;

    static {
        kge.a(-608581224);
    }

    public fpi() {
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            this.f28092a = Class.forName("android.content.res.XmlBlock").getConstructor(byte[].class);
            this.f28092a.setAccessible(true);
        } catch (Exception e) {
            Log.e("Home.FileParser", "Fail to get XmlBlock", e);
        }
    }

    @Override // tb.fpf
    public XmlPullParser a(String str, DinamicTemplate dinamicTemplate, b bVar) {
        if (this.f28092a == null || dinamicTemplate == null) {
            bVar.b().a(a.ERROR_CODE_XML_BLOCK_CONSTRUCTOR_REFLECT_ERROR, a.ERROR_CODE_XML_BLOCK_CONSTRUCTOR_REFLECT_ERROR);
            return null;
        }
        DTemplateManager a2 = DTemplateManager.a(str);
        if (!a2.b().a(a2.h(dinamicTemplate))) {
            bVar.b().a(a.ERROR_CODE_TEMPLATE_FILE_LOST, "downloaded file lost");
            return null;
        }
        try {
            byte[] b = a2.b(dinamicTemplate);
            if (b != null && b.length != 0) {
                try {
                    Object a3 = fpk.a(this.f28092a.newInstance(a(b, bVar)), "newParser", new Object[0]);
                    if (a3 instanceof XmlResourceParser) {
                        return (XmlResourceParser) a3;
                    }
                    bVar.b().a(a.ERROR_CODE_XML_RES_PARSER_ERROR, a.ERROR_CODE_XML_RES_PARSER_ERROR);
                    return null;
                } catch (Exception e) {
                    bVar.b().a(a.ERROR_CODE_BYTE_TO_PARSER_ERROR, e.getMessage());
                    return null;
                }
            }
            bVar.b().a(a.ERROR_CODE_TEMPLATE_FILE_EMPTY, "downloaded file empty");
            return null;
        } catch (Exception e2) {
            bVar.b().a(a.ERROR_CODE_BYTE_READ_ERROR, e2.getMessage());
            return null;
        }
    }
}
