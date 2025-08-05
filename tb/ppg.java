package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.sdk.utils.VideoStatus;

/* loaded from: classes8.dex */
public class ppg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private VideoStatus f32797a;
    private String b;
    private String c;
    private boolean d = false;
    private a e;

    static {
        kge.a(554057397);
    }

    public VideoStatus a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoStatus) ipChange.ipc$dispatch("66946637", new Object[]{this}) : this.f32797a;
    }

    public void a(VideoStatus videoStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ce9271", new Object[]{this, videoStatus});
        } else {
            this.f32797a = videoStatus;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public ppg(ppb ppbVar) {
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }
}
