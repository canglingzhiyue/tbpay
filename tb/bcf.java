package tb;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* loaded from: classes2.dex */
public final class bcf extends bce {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAMS_KEY_ANIMATION_FIELDS = "animationFields";

    static {
        kge.a(-337726784);
    }

    public bcf(bbz bbzVar) {
        super(bbzVar);
    }

    public void a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        IDMComponent b = this.b.w().b(str);
        if (b == null || (jSONObject2 = jSONObject.getJSONObject(PARAMS_KEY_ANIMATION_FIELDS)) == null) {
            return;
        }
        b.getFields().putAll(jSONObject2);
        this.f25794a.x().a(b);
    }

    public boolean b(String str, JSONObject jSONObject) {
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("676c0fe1", new Object[]{this, str, jSONObject})).booleanValue();
        }
        if (this.b.w().b(str) == null || (b = b(str)) == -1) {
            return false;
        }
        a(str, jSONObject);
        return a(b);
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        int b = b(str);
        if (b != -1) {
            return a(b);
        }
        return false;
    }

    public boolean a(final int i) {
        final RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0 || (recyclerView = (RecyclerView) this.f25794a.x().s()) == null) {
            return false;
        }
        recyclerView.post(new Runnable() { // from class: tb.bcf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    int a2 = bcf.this.f25794a.x().a(i);
                    int measuredHeight = recyclerView.getMeasuredHeight() / 3;
                    if (a2 <= measuredHeight) {
                        return;
                    }
                    ((LinearLayoutManager) recyclerView.getLayoutManager()).scrollToPositionWithOffset(i, measuredHeight);
                } catch (Exception e) {
                    e.printStackTrace();
                    jqg.a("CartAutoScrollAbility", "iCart scroll exception:" + e.getMessage());
                }
            }
        });
        return true;
    }

    public int b(String str) {
        List<IDMComponent> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        if (!TextUtils.isEmpty(str) && this.b != null && (b = this.b.x().b()) != null && !b.isEmpty()) {
            for (int i = 0; i < b.size(); i++) {
                IDMComponent iDMComponent = b.get(i);
                if (iDMComponent != null && iDMComponent.isNormalComponent() && str.equals(iDMComponent.getKey())) {
                    return i;
                }
            }
        }
        return -1;
    }
}
