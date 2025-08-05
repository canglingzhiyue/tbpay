package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class few extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SIMPLE_VIDEO_KEY = "taobao_simple_video";

    /* renamed from: a  reason: collision with root package name */
    public String f27874a;
    public String b;
    public float c;
    public float d;
    public String e;
    public String f;
    public int g;
    private final String h;
    private final String i;
    private final String j;

    static {
        kge.a(-2080256822);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.wrapper.ext.video.simplevideo.SimpleVideoViewModel";
    }

    public few(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        this.h = "title";
        this.i = "videoUrl";
        this.j = "thumbnail";
        this.g = 0;
        emu.a("com.taobao.android.detail.wrapper.ext.video.simplevideo.SimpleVideoViewModel");
        if (iDMComponent != null) {
            try {
                if (iDMComponent.getFields() != null) {
                    this.f = iDMComponent.getFields().getString("title");
                    this.b = iDMComponent.getFields().getString("videoUrl");
                    this.f27874a = iDMComponent.getFields().getString("thumbnail");
                }
            } catch (Exception e) {
                i.a("SimpleVideoViewModel", e.getMessage());
                return;
            }
        }
        if (this.c == 0.0f || this.d == 0.0f) {
            this.c = 9.0f;
            this.d = 16.0f;
        }
    }
}
