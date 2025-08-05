package com.taobao.android.litecreator.localization;

import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.orange.sync.IndexUpdateHandler;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.nog;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\"\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\"H\u0016J\u0012\u0010$\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0016R7\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006%"}, d2 = {"Lcom/taobao/android/litecreator/localization/UGCLocalizationManager;", "Lcom/taobao/android/litecreator/localization/listener/ILocalizationInterface;", "()V", "ugcChangeListenerMap", "Ljava/util/HashMap;", "Lcom/taobao/android/litecreator/localization/listener/IUGCLocaleChangeListener;", "Lcom/alibaba/ability/localization/Localization$LocaleChangeListener;", "Lkotlin/collections/HashMap;", "getUgcChangeListenerMap", "()Ljava/util/HashMap;", "ugcChangeListenerMap$delegate", "Lkotlin/Lazy;", "addLocaleChangeListener", "", DataReceiveMonitor.CB_LISTENER, "getLanguageTag", "", "getLocaleABTestString", "key", "sessionId", "getLocaleFormatDate", "timestamp", "", nog.PRICE_UNIT, "Ljava/util/concurrent/TimeUnit;", "getLocaleFormatDateTime", "getLocaleFormatTime", "getLocaleOrangeString", "orangeGroupName", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getLocaleString", IndexUpdateHandler.IndexUpdateInfo.SYNC_KEY_RESOURCEID, "", "isI18nEdition", "", "isSimplifiedChinese", "removeLocaleChangeListener", "litecreator_utils_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final d f13343a;

    static {
        kge.a(-291624363);
        kge.a(-182735200);
        INSTANCE = new b();
        f13343a = e.a(UGCLocalizationManager$ugcChangeListenerMap$2.INSTANCE);
    }

    private b() {
    }

    public String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        String a2 = com.alibaba.ability.localization.b.a(i);
        q.b(a2, "Localization.localizedString(resourceId)");
        return a2;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : com.alibaba.ability.localization.b.c();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        Language a2 = com.alibaba.ability.localization.b.a();
        q.b(a2, "Localization.getLanguage()");
        String tag = a2.getTag();
        q.b(tag, "Localization.getLanguage().tag");
        return tag;
    }
}
