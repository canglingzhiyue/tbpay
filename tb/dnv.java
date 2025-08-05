package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.viewholder.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Iterator;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class dnv extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ISBOTTOMINULTRONGROUP = 2193661634150641582L;
    public static final long DX_PARSER_ISTOPINULTRONGROUP = -5570070731196683927L;

    /* renamed from: a  reason: collision with root package name */
    private boolean f26877a;

    static {
        kge.a(232470763);
    }

    public static /* synthetic */ Object ipc$super(dnv dnvVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public dnv(boolean z) {
        this.f26877a = z;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object a2 = dXRuntimeContext.a();
        if (!(a2 instanceof Map)) {
            return null;
        }
        Object obj = ((Map) a2).get(d.TAG_DINAMICX_VIEW_COMPONENT);
        if (!(obj instanceof IDMComponent)) {
            return null;
        }
        IDMComponent iDMComponent = (IDMComponent) obj;
        if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof String)) {
            return Boolean.valueOf(a(iDMComponent, this.f26877a, objArr));
        }
        while (iDMComponent != null) {
            if (!a(iDMComponent, this.f26877a, objArr)) {
                return false;
            }
            iDMComponent = iDMComponent.getParent();
            if (objArr[0].equals(iDMComponent.getTag())) {
                break;
            }
        }
        return true;
    }

    private boolean a(IDMComponent iDMComponent, boolean z, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dafd9cd", new Object[]{this, iDMComponent, new Boolean(z), objArr})).booleanValue();
        }
        if (iDMComponent.getParent() != null && iDMComponent.getParent().getChildren() != null && iDMComponent.getParent().getChildren().size() != 0) {
            if (z) {
                if (objArr == null || objArr.length < 2 || !(objArr[1] instanceof String) || TextUtils.isEmpty((String) objArr[1])) {
                    return iDMComponent == iDMComponent.getParent().getChildren().get(0);
                }
                if (iDMComponent.getParent() != null && iDMComponent.getParent().getChildren() != null) {
                    Iterator<IDMComponent> it = iDMComponent.getParent().getChildren().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        IDMComponent next = it.next();
                        if (objArr[1].equals(TextUtils.isEmpty(next.getPosition()) ? AgooConstants.MESSAGE_BODY : next.getPosition())) {
                            if (next == iDMComponent) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } else if (iDMComponent == iDMComponent.getParent().getChildren().get(iDMComponent.getParent().getChildren().size() - 1)) {
                return true;
            }
        }
        return false;
    }
}
