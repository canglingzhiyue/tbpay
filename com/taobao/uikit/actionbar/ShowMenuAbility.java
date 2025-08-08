package com.taobao.uikit.actionbar;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.result.a$a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsGlobalMenuAbility;
import com.taobao.android.abilityidl.ability.GlobalMenuMenuClickResult;
import com.taobao.android.abilityidl.ability.ax;
import com.taobao.android.abilityidl.ability.ay;
import com.taobao.android.abilityidl.ability.bw;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.actionbar.util.MenuLog;
import java.util.ArrayList;
import java.util.List;
import tb.als;
import tb.kge;

/* loaded from: classes9.dex */
public class ShowMenuAbility extends AbsGlobalMenuAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShowMenuAbility";

    static {
        kge.a(1203213020);
    }

    public static /* synthetic */ Object ipc$super(ShowMenuAbility showMenuAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private boolean addMenu(TBPublicMenu tBPublicMenu, List<ax> list, final bw bwVar) {
        TBPublicMenuItem build;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7d8d847", new Object[]{this, tBPublicMenu, list, bwVar})).booleanValue();
        }
        if (list.isEmpty()) {
            return true;
        }
        final ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
        boolean z = false;
        for (ax axVar : list) {
            if (axVar == null || StringUtils.isEmpty(axVar.f8795a) || StringUtils.isEmpty(axVar.b)) {
                MenuLog.block("", TAG, "customPopoverItems is null. " + axVar);
                bwVar.a(a$a.b("addItems is null"));
                return false;
            }
            TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
            String str = axVar.b + ":";
            String str2 = axVar.f8795a;
            if (str2.contains(b.a(R.string.app_share))) {
                z = true;
            }
            builder.setTitle(str + str2);
            arrayList.add(builder.build());
            MenuLog.log(TAG, "customPopoverItems: title: " + build.getTitle() + "; imageUrl: " + build.getIconUrl());
        }
        TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener = new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.uikit.actionbar.ShowMenuAbility.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
            public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                    return;
                }
                GlobalMenuMenuClickResult globalMenuMenuClickResult = new GlobalMenuMenuClickResult();
                globalMenuMenuClickResult.index = arrayList.indexOf(tBPublicMenuItem);
                bwVar.a(globalMenuMenuClickResult);
            }
        };
        tBPublicMenu.addExternalMenus(arrayList, tBOnPublicMenuClickListener);
        if (z) {
            tBPublicMenu.getPresentar().addOnDefaultMenuClickListener(tBOnPublicMenuClickListener);
        }
        return true;
    }

    private void removeMenu(TBPublicMenu tBPublicMenu, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed83520", new Object[]{this, tBPublicMenu, list});
            return;
        }
        for (String str : list) {
            tBPublicMenu.removeCustomMenuItemsByType(str);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsGlobalMenuAbility
    public void show(als alsVar, ay ayVar, bw bwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("254b6a89", new Object[]{this, alsVar, ayVar, bwVar});
            return;
        }
        Activity activity = (Activity) alsVar.f().f();
        if (activity == null) {
            MenuLog.block("", TAG, "context is null");
            bwVar.a(a$a.d("context is null"));
            return;
        }
        TBPublicMenu tBPublicMenu = new TBPublicMenu(activity);
        if (ayVar.f8796a != null && !addMenu(tBPublicMenu, ayVar.f8796a, bwVar)) {
            return;
        }
        if (ayVar.b != null) {
            removeMenu(tBPublicMenu, ayVar.b);
        }
        tBPublicMenu.show();
    }
}
