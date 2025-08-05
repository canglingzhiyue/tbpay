package com.taobao.android.litecreator.localization;

import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "Lcom/taobao/android/litecreator/localization/listener/IUGCLocaleChangeListener;", "Lcom/alibaba/ability/localization/Localization$LocaleChangeListener;", "Lkotlin/collections/HashMap;", "invoke"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class UGCLocalizationManager$ugcChangeListenerMap$2 extends Lambda implements ruk<HashMap<Object, b.a>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final UGCLocalizationManager$ugcChangeListenerMap$2 INSTANCE = new UGCLocalizationManager$ugcChangeListenerMap$2();

    public UGCLocalizationManager$ugcChangeListenerMap$2() {
        super(0);
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final HashMap<Object, b.a> mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("cd9860a2", new Object[]{this}) : new HashMap<>();
    }
}
