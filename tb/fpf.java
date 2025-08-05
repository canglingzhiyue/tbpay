package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamic.view.b;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes5.dex */
public class fpf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-599197378);
        kge.a(-461575300);
    }

    public XmlPullParser a(String str, DinamicTemplate dinamicTemplate, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlPullParser) ipChange.ipc$dispatch("1c1e3fa6", new Object[]{this, str, dinamicTemplate, bVar});
        }
        return null;
    }

    public byte[] a(byte[] bArr, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("988c1a76", new Object[]{this, bArr, bVar}) : bArr;
    }
}
