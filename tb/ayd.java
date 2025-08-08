package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

@AURAExtensionImpl(code = ayd.CODE)
/* loaded from: classes2.dex */
public final class ayd extends asn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "aura.impl.parse.renderTreeFilter.freeNode";

    static {
        kge.a(-1437409637);
    }

    public static /* synthetic */ Object ipc$super(ayd aydVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.asn, tb.asp
    public boolean a(RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcc341d3", new Object[]{this, renderComponent})).booleanValue();
        }
        if (renderComponent == null) {
            return false;
        }
        String position = renderComponent.component.getPosition();
        if (StringUtils.isEmpty(position)) {
            return false;
        }
        boolean a2 = a(position);
        if (a2) {
            a(position, renderComponent);
        }
        return a2;
    }

    private void a(String str, RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea350719", new Object[]{this, str, renderComponent});
            return;
        }
        Map map = (Map) b().get("aura_global_data_free_node", Map.class);
        if (map == null) {
            map = new HashMap();
        }
        map.put(str, renderComponent);
        b().update("aura_global_data_free_node", map);
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        for (ayf ayfVar : a().b(ayf.class)) {
            if (!StringUtils.isEmpty(str) && str.equals(ayfVar.d())) {
                return true;
            }
        }
        return false;
    }
}
