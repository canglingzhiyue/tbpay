package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.newsetting.dx.e;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/general/MTBSettingSwitchReverseEventHandler;", "Lcom/taobao/mytaobao/newsetting/dx/MTBSettingSwitchEventHandler;", "()V", "saveSwitch", "", "key", "", "isCheck", "", "Companion", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class tfk extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String EVENT_HANDLER_SWITCH_REVERSE = "eventhandler.mtb.widget.setting.switch.reverse";

    static {
        kge.a(-450510652);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(tfk tfkVar, String str, Object... objArr) {
        if (str.hashCode() == -2128352030) {
            super.a((String) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/general/MTBSettingSwitchReverseEventHandler$Companion;", "", "()V", "EVENT_HANDLER_SWITCH_REVERSE", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(2107541260);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // com.taobao.mytaobao.newsetting.dx.e
    public void a(String key, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, key, new Boolean(z)});
            return;
        }
        q.c(key, "key");
        super.a(key, !z);
    }
}
