package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.mytaobao.basement.monitor.b;
import com.taobao.tao.log.TLog;

/* loaded from: classes7.dex */
public class mwk extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_MFAVORTEXTVIEW = 4151482766289044377L;
    public static final long DX_MFAVORTEXTVIEW_TEXT = 38178040921L;
    public static final String TAG = "MFavorTextView";

    static {
        kge.a(-973525149);
    }

    public static /* synthetic */ Object ipc$super(mwk mwkVar, String str, Object... objArr) {
        if (str.hashCode() == 1115049375) {
            super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes7.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1334316230);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            b.a().a("XMFavorTextViewWidgetNode.build");
            return new mwk();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        b.a().a("XMFavorTextViewWidgetNode.build1");
        return new mwk();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 38178040921L) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (a(str)) {
                setText(str);
            } else {
                setText("--");
            }
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Long.parseLong(str) >= 0;
        } catch (Exception e) {
            TLog.loge(TAG, e.getMessage());
            return false;
        }
    }
}
