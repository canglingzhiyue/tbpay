package tb;

import android.view.ViewGroup;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class ffe implements ffc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f27884a = "AliSDetailMainGalleryUrlSizeAssembler";

    static {
        kge.a(1441686827);
        kge.a(1436023986);
    }

    public ffe() {
        emu.a("com.taobao.android.detail.wrapper.industry.maingallery.render.component.vessel.urlassembler.impl.TBDetailMainGalleryUrlSizeAssembler");
    }

    @Override // tb.ffc
    public void a(ViewGroup viewGroup, AURARenderComponent aURARenderComponent, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eedc97f", new Object[]{this, viewGroup, aURARenderComponent, hashMap});
            return;
        }
        int a2 = a(viewGroup);
        int[] a3 = a(aURARenderComponent);
        int i = a3[0];
        int i2 = a3[1];
        if (a2 <= 0) {
            a2 = i;
        } else {
            i2 = (int) (((i2 * 1.0f) * a2) / i);
        }
        hashMap.put("MAINPIC_WIDTH", String.valueOf(a2));
        hashMap.put("MAINPIC_HEIGHT", String.valueOf(i2));
    }

    private int[] a(AURARenderComponent aURARenderComponent) {
        int parseInt;
        int parseInt2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("85655771", new Object[]{this, aURARenderComponent});
        }
        String[] split = emh.a(aURARenderComponent, emh.sDefaultDimension).split(":");
        if (split.length >= 2) {
            try {
                parseInt = Integer.parseInt(split[0]);
                parseInt2 = Integer.parseInt(split[1]);
            } catch (Exception e) {
                arc.a().c("AliSDetailMainGalleryUrlSizeAssembler", "appendSizeToQueryParam#解析比例出错", e.getMessage());
            }
            return new int[]{parseInt, parseInt2};
        }
        parseInt2 = 1;
        parseInt = 1;
        return new int[]{parseInt, parseInt2};
    }

    private int a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a18609a", new Object[]{this, viewGroup})).intValue();
        }
        int width = viewGroup.getWidth();
        if (width > 0) {
            return width;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            width = layoutParams.width;
        }
        return Math.max(width, 0);
    }
}
