package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamic.view.b;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes5.dex */
public class fpl extends fpf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(638787682);
    }

    @Override // tb.fpf
    public XmlPullParser a(String str, DinamicTemplate dinamicTemplate, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (XmlPullParser) ipChange.ipc$dispatch("1c1e3fa6", new Object[]{this, str, dinamicTemplate, bVar}) : DTemplateManager.a(str).a(dinamicTemplate);
    }
}
