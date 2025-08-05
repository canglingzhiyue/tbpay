package tb;

import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.java.SourceType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.ak;
import com.taobao.android.litecreator.sdk.editor.data.Adjust;
import com.taobao.android.litecreator.util.k;
import com.taobao.android.litecreator.util.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class mxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MeEditor b;
    private Adjust c;
    private String e;

    /* renamed from: a  reason: collision with root package name */
    private List<String> f31318a = new ArrayList();
    private boolean d = false;

    static {
        kge.a(220404740);
    }

    public void a(MeEditor meEditor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83bf53c5", new Object[]{this, meEditor});
        } else {
            this.b = meEditor;
        }
    }

    public void a(Adjust adjust, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2763ab1f", new Object[]{this, adjust, list});
            return;
        }
        this.f31318a = list;
        this.c = adjust;
        if (adjust == null) {
            return;
        }
        a(adjust);
    }

    private void a(Adjust adjust) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a33a2e", new Object[]{this, adjust});
        } else if (this.b == null) {
            u.d("ImageAdjustImpl", "mNewEditor == null");
        } else {
            String str = adjust.mDirPath;
            if (!k.a(str)) {
                u.d("ImageAdjustImpl", "adjust dirPath not exist " + str);
                return;
            }
            if (!this.d) {
                if (this.f31318a.size() == 1) {
                    this.d = this.b.addExtentionEffectForClip(this.f31318a.get(0), str, Adjust.IMAGE_ADJUST_KEY, 1L) == 0;
                    this.e = this.f31318a.get(0);
                } else {
                    this.e = this.b.addExtensionClip("", str, 0L, (long) ak.IMAGE_CLIP_DURATION_US, Adjust.IMAGE_ADJUST_KEY, SourceType.kSourceTexture, 1L);
                    this.d = true;
                }
            }
            if (!this.d || this.c.mParamsValues == null || this.c.mParamsValues.isEmpty()) {
                return;
            }
            if (this.c.mDirtyType == 2) {
                for (String str2 : this.c.mParamsValues.keySet()) {
                    this.b.getCoreEditor().setProperty(this.e, Adjust.IMAGE_ADJUST_KEY, str2, this.c.mParamsValues.get(str2).floatValue());
                }
                return;
            }
            String str3 = this.c.mSingleKey;
            Float f = this.c.mParamsValues.get(this.c.mSingleKey);
            if (f == null) {
                return;
            }
            u.b("ImageAdjustImpl", "adjust key = " + str3 + ",value = " + f);
            this.b.getCoreEditor().setProperty(this.e, Adjust.IMAGE_ADJUST_KEY, str3, (double) f.floatValue());
        }
    }
}
