package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.marvel.MeEditor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.AiQuality;
import com.taobao.android.litecreator.util.k;
import com.taobao.android.litecreator.util.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class ioo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<String> f29191a = new ArrayList();
    private MeEditor b;
    private AiQuality c;

    static {
        kge.a(814176823);
    }

    public void a(MeEditor meEditor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83bf53c5", new Object[]{this, meEditor});
        } else {
            this.b = meEditor;
        }
    }

    public void a(AiQuality aiQuality, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("556f0f2d", new Object[]{this, aiQuality, list});
            return;
        }
        this.f29191a = list;
        this.c = aiQuality;
        if (aiQuality == null || !aiQuality.enable) {
            a();
        } else if (StringUtils.isEmpty(aiQuality.dirPath) || !aiQuality.enable) {
        } else {
            a(aiQuality);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b == null) {
            u.d("AIQualityMarvelHelper", "mNewEditor == null");
        } else {
            for (String str : this.f29191a) {
                this.b.removeExtensionEffectFromClip(str, AiQuality.QUALITY_KEY);
            }
        }
    }

    private void a(AiQuality aiQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e47a3c", new Object[]{this, aiQuality});
        } else if (this.b == null) {
            u.d("AIQualityMarvelHelper", "mNewEditor == null");
        } else {
            String str = aiQuality.dirPath;
            if (!k.a(str)) {
                u.d("AIQualityMarvelHelper", "ai quality dirPath not exist " + str);
            }
            for (String str2 : this.f29191a) {
                this.b.addExtentionEffectForClip(str2, str, AiQuality.QUALITY_KEY, 1L);
            }
        }
    }
}
