package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.aa;
import com.taobao.mediaplay.d;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class flo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f28036a = 512000;
    private List<String> b = new ArrayList();
    private boolean c = false;

    static {
        kge.a(1607092880);
    }

    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{this, context, str, new Boolean(z)});
        } else if (this.c) {
            this.b.add(str);
            fjt.a(fjt.TAG_RENDER, "当前队列里有等待预下载的视频，加到队列里：" + str);
        } else {
            aa.a(context, str, a(), 512000, new a(str));
            if (z) {
                this.c = true;
            }
            fjt.a(fjt.TAG_RENDER, "当前队列里没有等待预下载的视频，直接开始预下载：" + str);
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        for (String str : this.b) {
            if (!TextUtils.isEmpty(str)) {
                aa.a(context, str, a(), 512000, new a(str));
                fjt.a(fjt.TAG_RENDER, "triggerVideoPreload, videoId: " + str);
            }
        }
        this.b.clear();
        this.c = false;
    }

    private static HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[0]);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("userId", fjm.b());
        hashMap.put(MusLiveVideo.ATTR_PLAY_SCENES, "newdetail");
        hashMap.put("from", "newdetail_native");
        hashMap.put("videoChannel", "newDetailNative");
        return hashMap;
    }

    /* loaded from: classes5.dex */
    public class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f28037a;

        static {
            kge.a(1409306638);
            kge.a(-878894432);
        }

        @Override // com.taobao.mediaplay.d
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            }
        }

        public a(String str) {
            this.f28037a = str;
        }

        @Override // com.taobao.mediaplay.d
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                fjt.a(fjt.TAG_RENDER, "开始预加载视频：".concat(str).concat(" ，videoId：").concat(this.f28037a));
            }
        }

        @Override // com.taobao.mediaplay.d
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                fjt.a(fjt.TAG_RENDER, "预加载视频完成videoId：".concat(this.f28037a).concat("长度:").concat(String.valueOf(i)));
            }
        }
    }
}
