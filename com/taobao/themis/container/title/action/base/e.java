package com.taobao.themis.container.title.action.base;

import android.view.View;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\rJ\b\u0010\u0002\u001a\u00020\u0003H&J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH&J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lcom/taobao/themis/container/title/action/base/IButtonAction;", "", "hideButton", "", "setButton", "", "lightIcon", "Landroid/graphics/drawable/Drawable;", "darkIcon", DataReceiveMonitor.CB_LISTENER, "Landroid/view/View$OnClickListener;", "", "showButton", "ButtonParams", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface e {
    void a(String str, String str2, View.OnClickListener onClickListener);

    boolean a();

    boolean b();
}
