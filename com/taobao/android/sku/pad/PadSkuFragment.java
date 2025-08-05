package com.taobao.android.sku.pad;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.sku.utils.o;
import com.taobao.android.sku.widget.SkuDialogFragment;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/taobao/android/sku/pad/PadSkuFragment;", "Lcom/taobao/android/sku/widget/SkuDialogFragment;", "()V", "isShowing", "", "show", "", ThemisConfig.SCENE_MANAGER, "Landroid/support/v4/app/FragmentManager;", "tag", "", "detail-sku_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class PadSkuFragment extends SkuDialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(133643739);
    }

    public static /* synthetic */ Object ipc$super(PadSkuFragment padSkuFragment, String str, Object... objArr) {
        if (str.hashCode() == 1639966335) {
            super.show((FragmentManager) objArr[0], (String) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.sku.widget.SkuDialogFragment
    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue() : isVisible();
    }

    @Override // com.taobao.android.sku.widget.SkuDialogFragment, android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        if (isVisible()) {
            return;
        }
        try {
            Field dismissedField = DialogFragment.class.getDeclaredField("mDismissed");
            q.b(dismissedField, "dismissedField");
            dismissedField.setAccessible(true);
            dismissedField.set(this, false);
            Field showByMeField = DialogFragment.class.getDeclaredField("mShownByMe");
            q.b(showByMeField, "showByMeField");
            showByMeField.setAccessible(true);
            showByMeField.set(this, true);
            q.a(fragmentManager);
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.add(this, str);
            beginTransaction.commitAllowingStateLoss();
        } catch (Throwable th) {
            super.show(fragmentManager, str);
            o.b("fragment show error : " + th.getMessage());
        }
    }
}
