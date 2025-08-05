package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.PlayControllerConfig;

/* loaded from: classes.dex */
public class lta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f30909a;
    private PlayControllerConfig b;
    private PlayControllerConfig c;
    private Boolean d;

    static {
        kge.a(956289535);
    }

    public static /* synthetic */ String a(lta ltaVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ef43357", new Object[]{ltaVar, str}) : ltaVar.b(str);
    }

    public lta(ljs ljsVar) {
        this.f30909a = ljsVar.a().a();
    }

    public PlayControllerConfig a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControllerConfig) ipChange.ipc$dispatch("95f518a6", new Object[]{this});
        }
        PlayControllerConfig playControllerConfig = this.b;
        if (playControllerConfig != null) {
            return playControllerConfig;
        }
        this.b = a(this.f30909a);
        if (this.b == null) {
            this.b = new PlayControllerConfig();
            ldf.d("PlayControllerConfigParser", "使用默认配置 ： " + this.b.toString());
        } else {
            ldf.d("PlayControllerConfigParser", "文件读取的配置 ： " + this.b.toString());
        }
        a(this.b);
        PlayControllerConfig playControllerConfig2 = this.b;
        this.c = playControllerConfig2;
        return playControllerConfig2;
    }

    public PlayControllerConfig a(IContainerDataModel<?> iContainerDataModel) {
        PlayControllerConfig playControllerConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControllerConfig) ipChange.ipc$dispatch("a65d041b", new Object[]{this, iContainerDataModel});
        }
        PlayControllerConfig a2 = a();
        JSONObject b = b(iContainerDataModel);
        String str = null;
        PlayControllerConfig playControllerConfig2 = b != null ? (PlayControllerConfig) JSON.parseObject(b.toJSONString(), PlayControllerConfig.class) : null;
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("服务端下发的配置： ");
        if (playControllerConfig2 != null) {
            str = playControllerConfig2.toString();
        }
        sb.append(str);
        strArr[0] = sb.toString();
        ldf.d("PlayControllerConfigParser", strArr);
        if (!ObjectUtils.a(this.c, playControllerConfig2)) {
            this.c = playControllerConfig2;
            a(this.f30909a, this.c);
        }
        if (playControllerConfig2 == null || !playControllerConfig2.isValid()) {
            playControllerConfig = new PlayControllerConfig();
        } else {
            playControllerConfig = a2.deepCopy();
        }
        playControllerConfig.setPlayControlEnable(a2.isPlayControlEnable());
        return playControllerConfig;
    }

    private JSONObject b(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("50f278d2", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel == null) {
            ldf.d("PlayControllerConfigParser", "containerDataModel == null");
            return null;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            ldf.d("PlayControllerConfigParser", "baseData == null");
            return null;
        }
        JSONObject ext = base.getExt();
        if (ext == null) {
            ldf.d("PlayControllerConfigParser", "ext == null");
            return null;
        }
        return ext.getJSONObject("homeGlobalABTest");
    }

    private void a(final String str, final PlayControllerConfig playControllerConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ec43ea", new Object[]{this, str, playControllerConfig});
        } else {
            ljd.a().a(new Runnable() { // from class: tb.lta.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    PlayControllerConfig playControllerConfig2 = playControllerConfig;
                    liz.b(lta.a(lta.this, str), playControllerConfig2 == null ? null : JSON.toJSONString(playControllerConfig2));
                }
            });
        }
    }

    private PlayControllerConfig a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControllerConfig) ipChange.ipc$dispatch("ab8b7f1c", new Object[]{this, str});
        }
        String a2 = liz.a(b(str), null);
        if (!TextUtils.isEmpty(a2)) {
            return (PlayControllerConfig) JSON.parseObject(a2, PlayControllerConfig.class);
        }
        return null;
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        return "PlayControllerConfig" + str;
    }

    private void a(PlayControllerConfig playControllerConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab5dba0", new Object[]{this, playControllerConfig});
            return;
        }
        if (this.d == null) {
            this.d = Boolean.valueOf(ldj.a("enablePlayControllerByService", true));
        }
        playControllerConfig.setPlayControlEnable(this.d.booleanValue());
    }
}
