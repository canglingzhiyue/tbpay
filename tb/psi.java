package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class psi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f32863a;
    private MediaData c;
    private a f;
    private int b = 0;
    private String d = null;
    private String e = null;

    /* loaded from: classes8.dex */
    public interface a {
        void a(Context context, pse pseVar, boolean z, boolean z2, boolean z3, String str);
    }

    static {
        kge.a(-469062570);
        f32863a = psi.class.getSimpleName();
    }

    public psi(MediaData mediaData) {
        this.c = mediaData;
        a(this.c, b());
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec7a9f5", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public boolean a(Context context, pse pseVar, IMediaPlayer iMediaPlayer, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a731d3f2", new Object[]{this, context, pseVar, iMediaPlayer, new Integer(i), new Integer(i2), str})).booleanValue() : b(context, pseVar, iMediaPlayer, i, i2, str);
    }

    private ArrayList<MediaData.QualityLiveItem> a(MediaData mediaData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("f4818f22", new Object[]{this, mediaData}) : mediaData.liveUrlList;
    }

    private int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        MediaData mediaData = this.c;
        if (mediaData == null) {
            return -1;
        }
        return b(mediaData);
    }

    private int b(MediaData mediaData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4121c11a", new Object[]{this, mediaData})).intValue();
        }
        if (mediaData == null) {
            return -1;
        }
        return a(a(mediaData));
    }

    private int a(ArrayList<MediaData.QualityLiveItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfaf7e35", new Object[]{this, arrayList})).intValue();
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return -1;
        }
        if (arrayList.size() == 1) {
            return 0;
        }
        arrayList.size();
        return 1;
    }

    private boolean a(Context context, pse pseVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e245683", new Object[]{this, context, pseVar, new Integer(i), str})).booleanValue();
        }
        a aVar = this.f;
        if (aVar != null) {
            aVar.a(context, pseVar, false, false, false, str);
        }
        this.d = null;
        this.e = null;
        return true;
    }

    private boolean b(Context context, pse pseVar, IMediaPlayer iMediaPlayer, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0994cd1", new Object[]{this, context, pseVar, iMediaPlayer, new Integer(i), new Integer(i2), str})).booleanValue();
        }
        String str2 = f32863a;
        TLog.loge(str2, "handlePlayError  what = " + i + " extra = " + i2);
        if (TextUtils.isEmpty(this.d) && TextUtils.isEmpty(this.e)) {
            return false;
        }
        a(context, pseVar, i, str);
        return -10610 != i;
    }

    private void a(MediaData mediaData, int i) {
        ArrayList<MediaData.QualityLiveItem> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38d3cbb", new Object[]{this, mediaData, new Integer(i)});
        } else if (mediaData == null || mediaData.liveUrlList == null || mediaData.liveUrlList.size() == 0 || i < 0 || (a2 = a(mediaData)) == null) {
        } else {
            if (this.e == null && prr.o() && a2.get(i).rtcLiveUrl != null) {
                this.e = a2.get(i).rtcLiveUrl;
            }
            if (this.d != null || !prr.n() || a2.get(i).bfrtcUrl == null) {
                return;
            }
            this.d = a2.get(i).bfrtcUrl;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f = null;
        }
    }
}
