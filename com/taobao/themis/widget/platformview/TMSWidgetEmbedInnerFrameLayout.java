package com.taobao.themis.widget.platformview;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class TMSWidgetEmbedInnerFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mSizeChangedListener;
    private b mVisibilityChangedListener;

    /* loaded from: classes9.dex */
    interface a {
        void a(int i, int i2, int i3, int i4);
    }

    /* loaded from: classes9.dex */
    interface b {
        void a(int i);
    }

    static {
        kge.a(-1813004258);
    }

    public static /* synthetic */ Object ipc$super(TMSWidgetEmbedInnerFrameLayout tMSWidgetEmbedInnerFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != 1389530587) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
    }

    public TMSWidgetEmbedInnerFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        a aVar = this.mSizeChangedListener;
        if (aVar == null) {
            return;
        }
        aVar.a(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        b bVar = this.mVisibilityChangedListener;
        if (bVar == null) {
            return;
        }
        bVar.a(i);
    }

    public TMSWidgetEmbedInnerFrameLayout whenSizeChanged(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSWidgetEmbedInnerFrameLayout) ipChange.ipc$dispatch("272a65d3", new Object[]{this, aVar});
        }
        this.mSizeChangedListener = aVar;
        return this;
    }

    public TMSWidgetEmbedInnerFrameLayout whenWindowVisibilityChanged(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSWidgetEmbedInnerFrameLayout) ipChange.ipc$dispatch("3f5a81f5", new Object[]{this, bVar});
        }
        this.mVisibilityChangedListener = bVar;
        return this;
    }
}
