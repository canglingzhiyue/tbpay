package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.a;
import com.taobao.taopai2.material.business.musicdetail.MusicItemBean;

/* loaded from: classes8.dex */
public class qcb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f32903a;
    public static int b;

    static {
        kge.a(-1738121617);
        f32903a = 7;
        b = 4;
    }

    public static void a(String str, String str2, MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b624f09", new Object[]{str, str2, musicItemBean});
        } else {
            a(str, str2, b, musicItemBean);
        }
    }

    public static void b(String str, String str2, MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ee9f20a", new Object[]{str, str2, musicItemBean});
        } else {
            b(str, str2, b, musicItemBean);
        }
    }

    public static void c(String str, String str2, MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8271950b", new Object[]{str, str2, musicItemBean});
        } else {
            c(str, str2, b, musicItemBean);
        }
    }

    public static void d(String str, String str2, MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f9380c", new Object[]{str, str2, musicItemBean});
        } else {
            d(str, str2, b, musicItemBean);
        }
    }

    public static void a(String str, String str2, int i, MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb237e94", new Object[]{str, str2, new Integer(i), musicItemBean});
        } else {
            a(str, str2, i, musicItemBean, "100");
        }
    }

    public static void b(String str, String str2, int i, MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38903bb3", new Object[]{str, str2, new Integer(i), musicItemBean});
        } else {
            a(str, str2, i, musicItemBean, "101");
        }
    }

    public static void c(String str, String str2, int i, MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5fcf8d2", new Object[]{str, str2, new Integer(i), musicItemBean});
        } else {
            a(str, str2, i, musicItemBean, "102");
        }
    }

    public static void d(String str, String str2, int i, MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1369b5f1", new Object[]{str, str2, new Integer(i), musicItemBean});
        } else {
            a(str, str2, i, musicItemBean, "103");
        }
    }

    private static void a(String str, String str2, int i, MusicItemBean musicItemBean, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc5ab5e", new Object[]{str, str2, new Integer(i), musicItemBean, str3});
        } else if (musicItemBean.vendorType == 10) {
        } else {
            qcc qccVar = new qcc(musicItemBean.id, musicItemBean.audioId, musicItemBean.vendorType);
            if (str != null) {
                qccVar.a(str);
            }
            if (str2 != null) {
                qccVar.b(str2);
            }
            qccVar.b(i);
            qccVar.a(str3, String.valueOf(System.currentTimeMillis() / 1000));
            new a().a(qccVar);
        }
    }
}
