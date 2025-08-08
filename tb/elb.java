package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.android.detail.core.standard.video.d;
import com.taobao.android.detail.core.standard.video.n;
import com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryProgressBar;
import com.taobao.taobao.R;

@AURAExtensionImpl(code = "alidetail.impl.locator.connector.receiver.progressBar")
/* loaded from: classes4.dex */
public final class elb implements ekl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AURAGlobalData f27392a;
    private d b;

    static {
        kge.a(1754654311);
        kge.a(-1823923563);
    }

    @Override // tb.ekl
    public String F_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec7b57c0", new Object[]{this});
        }
        return null;
    }

    @Override // tb.eki
    public void b(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d586e2b4", new Object[]{this, ekkVar});
        }
    }

    @Override // tb.eki
    public void c(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c409e935", new Object[]{this, ekkVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public elb() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.render.component.PicGalleryProgressBarLocatorExtension");
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.f27392a = aURAGlobalData;
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.b = (d) qVar.a().get("AliDetailPicGalleryVideoManager");
        }
    }

    @Override // tb.eki
    public void a(ekk ekkVar) {
        PicGalleryProgressBar picGalleryProgressBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e703dc33", new Object[]{this, ekkVar});
            return;
        }
        AURAGlobalData aURAGlobalData = this.f27392a;
        if (aURAGlobalData == null || (picGalleryProgressBar = (PicGalleryProgressBar) aURAGlobalData.get("AliDetailPicGalleryProgressBar", PicGalleryProgressBar.class)) == null) {
            return;
        }
        if (emg.a(ekkVar)) {
            a(picGalleryProgressBar, ekkVar);
        } else {
            b(picGalleryProgressBar, ekkVar);
            picGalleryProgressBar.setShowVideoProgressBarWhenTouchDown(false);
        }
        picGalleryProgressBar.showFrameDesc(d(ekkVar));
        emj.a(this.f27392a);
    }

    private String d(ekk ekkVar) {
        AURARenderComponent f;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71ffa7aa", new Object[]{this, ekkVar});
        }
        if (ekkVar != null && (f = ekkVar.f()) != null && f.data != null && f.data.fields != null && (obj = f.data.fields.get("skuText")) != null) {
            return obj.toString();
        }
        return null;
    }

    private AURARenderComponent e(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("692bb62", new Object[]{this, ekkVar}) : ekkVar.f();
    }

    private void a(PicGalleryProgressBar picGalleryProgressBar, ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdd4e42b", new Object[]{this, picGalleryProgressBar, ekkVar});
        } else if (emg.b(ekkVar)) {
            picGalleryProgressBar.setVisibility(4);
        } else {
            int a2 = ekkVar.a();
            int e = ekkVar.e();
            String b = ekkVar.b();
            AURARenderComponent e2 = e(ekkVar);
            if (this.b == null) {
                b(picGalleryProgressBar, ekkVar);
                return;
            }
            AbsPicGalleryVideoPlayer a3 = this.b.a(n.a(e2));
            if (a3 == null) {
                b(picGalleryProgressBar, ekkVar);
                return;
            }
            a3.a(n.EXT_KEY_VIDEO_COUNT_IN_FRAME_GROUP, Integer.valueOf(a2));
            if (a2 <= 1 && "init".equals(a3.p())) {
                picGalleryProgressBar.setVisibility(4);
            } else {
                picGalleryProgressBar.setVisibility(0);
            }
            picGalleryProgressBar.setFrameCount(a2);
            picGalleryProgressBar.setFrameIndex(e);
            picGalleryProgressBar.setFrameTagColor(e);
            picGalleryProgressBar.showFrameProgress();
            a(picGalleryProgressBar, b);
            if (StringUtils.equals(a3.p(), "init")) {
                picGalleryProgressBar.setFrameProgress(e);
            } else {
                picGalleryProgressBar.setFrameProgress(e + a3.q());
            }
        }
    }

    private void b(PicGalleryProgressBar picGalleryProgressBar, ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261b246c", new Object[]{this, picGalleryProgressBar, ekkVar});
            return;
        }
        int a2 = ekkVar.a();
        int e = ekkVar.e();
        String b = ekkVar.b();
        if (1 == a2) {
            picGalleryProgressBar.setVisibility(4);
            return;
        }
        picGalleryProgressBar.setVisibility(0);
        picGalleryProgressBar.setFrameCount(a2);
        picGalleryProgressBar.setFrameIndex(e);
        picGalleryProgressBar.setFrameProgress(e + 1);
        picGalleryProgressBar.setFrameTagColor(e);
        picGalleryProgressBar.showFrameProgress();
        a(picGalleryProgressBar, b);
    }

    private void a(PicGalleryProgressBar picGalleryProgressBar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a7be2a", new Object[]{this, picGalleryProgressBar, str});
            return;
        }
        Object tag = picGalleryProgressBar.getTag(R.id.progress_bar_frame_tag);
        if (!(tag instanceof JSONObject)) {
            picGalleryProgressBar.setFrameTagText(null);
            return;
        }
        JSONArray jSONArray = ((JSONObject) tag).getJSONArray(str);
        if (jSONArray == null || jSONArray.isEmpty()) {
            picGalleryProgressBar.setFrameTagText(null);
            return;
        }
        String[] strArr = new String[jSONArray.size()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = jSONArray.getString(i);
        }
        picGalleryProgressBar.setFrameTagText(strArr);
    }
}
