package com.tmall.android.dai.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.config.Config;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import com.tmall.android.dai.model.g;
import com.tmall.android.dai.trigger.TriggerMatchResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class i extends g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<g.a> e;
    private String f;
    private List<g.a> g;
    private List<g.a> h;
    private List<g.a> i;
    private List<g.a> j;
    private List<g.a> k;
    private Map<String, List<g.a>> l;
    private Map<String, List<g.a>> m;
    private ArrayList<String> n;

    static {
        kge.a(1295126688);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        if (str.hashCode() == -1968821097) {
            return super.a((UserTrackDO) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public i(Config.ModelTriggerMatchRuleForUT modelTriggerMatchRuleForUT) {
        if (modelTriggerMatchRuleForUT != null) {
            if (modelTriggerMatchRuleForUT.eventId <= 0 && modelTriggerMatchRuleForUT.eventId != -19999) {
                return;
            }
            this.f23723a = modelTriggerMatchRuleForUT.eventId;
            this.b = modelTriggerMatchRuleForUT.ownerId;
            this.c = modelTriggerMatchRuleForUT.batch;
            this.e = b(modelTriggerMatchRuleForUT.pageNotInList);
            this.g = b(modelTriggerMatchRuleForUT.pageInList);
            this.h = b(modelTriggerMatchRuleForUT.arg1NotInList);
            this.i = b(modelTriggerMatchRuleForUT.arg1InList);
            this.j = b(modelTriggerMatchRuleForUT.arg2InList);
            this.k = b(modelTriggerMatchRuleForUT.arg3InList);
            this.l = a(modelTriggerMatchRuleForUT.argsNotInMap);
            this.m = a(modelTriggerMatchRuleForUT.argsInMap);
        }
    }

    public static String a(List<g.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{list});
        }
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (g.a aVar : list) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(aVar.b());
        }
        return sb.toString();
    }

    @Override // com.tmall.android.dai.model.g
    public TriggerMatchResult a(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriggerMatchResult) ipChange.ipc$dispatch("8aa62c97", new Object[]{this, userTrackDO});
        }
        TriggerMatchResult a2 = super.a(userTrackDO);
        if (!a2.f23726a) {
            return a2;
        }
        if (!c(this.e) && a(this.e, userTrackDO.getPageName())) {
            return TriggerMatchResult.a(TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_PAGE_NOT_MATCH, "page_not_in not match");
        }
        if (!c(this.g) && !a(this.g, userTrackDO.getPageName())) {
            return TriggerMatchResult.a(TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_PAGE_NOT_MATCH, "page not match");
        }
        if (!c(this.h) && a(this.h, userTrackDO.getArg1())) {
            return TriggerMatchResult.a(TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG1_NOT_MATCH, "arg1_not_in not match");
        }
        if (!c(this.i) && !a(this.i, userTrackDO.getArg1())) {
            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG1_NOT_MATCH;
            return TriggerMatchResult.a(triggerMatchResultCode, "arg1 not match required " + a(this.i) + " got " + userTrackDO.getArg1());
        } else if (!c(this.j) && !a(this.j, userTrackDO.getArg2())) {
            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode2 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG2_NOT_MATCH;
            return TriggerMatchResult.a(triggerMatchResultCode2, "arg2 not match required " + a(this.j) + " got " + userTrackDO.getArg2());
        } else if (!c(this.k) && !a(this.k, userTrackDO.getArg3())) {
            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode3 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG3_NOT_MATCH;
            return TriggerMatchResult.a(triggerMatchResultCode3, "arg3 not match required " + a(this.k) + " got " + userTrackDO.getArg3());
        } else {
            if (!b(this.l)) {
                for (Map.Entry<String, String> entry : userTrackDO.getArgs().entrySet()) {
                    List<g.a> list = this.l.get(entry.getKey());
                    if (!c(list) && a(list, entry.getValue())) {
                        TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode4 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARGS_NOT_MATCH;
                        return TriggerMatchResult.a(triggerMatchResultCode4, "args_not_in not match key :" + entry.getKey() + " got value " + entry.getValue());
                    }
                }
            }
            if (!b(this.m)) {
                Map<String, String> args = userTrackDO.getArgs();
                Map<String, List<g.a>> map = this.m;
                if (map != null && args != null) {
                    if (map.size() > args.size()) {
                        TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode5 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARGS_NOT_MATCH;
                        return TriggerMatchResult.a(triggerMatchResultCode5, "args match size " + this.m.size() + "data size : " + userTrackDO.getArgs().size());
                    }
                    for (Map.Entry<String, List<g.a>> entry2 : this.m.entrySet()) {
                        List<g.a> value = entry2.getValue();
                        if (!c(value) && !a(value, args.get(entry2.getKey()))) {
                            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode6 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARGS_NOT_MATCH;
                            return TriggerMatchResult.a(triggerMatchResultCode6, "args_not_in not match key :" + entry2.getKey() + " required value " + a(entry2.getValue()) + " got value: " + args.get(entry2.getKey()));
                        }
                    }
                }
            }
            return TriggerMatchResult.a();
        }
    }

    private List<g.a> b(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b5ee42d", new Object[]{this, list});
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(new g.a(str));
            }
        }
        return arrayList;
    }

    private Map<String, List<g.a>> a(Map<String, List<String>> map) {
        List<String> value;
        List<g.a> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        if (map == null || map.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && (value = entry.getValue()) != null && value.size() > 0 && (b = b(value)) != null && b.size() > 0) {
                hashMap.put(entry.getKey(), b);
            }
        }
        return hashMap;
    }

    private boolean c(List<g.a> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e037145f", new Object[]{this, list})).booleanValue() : list == null || list.size() <= 0;
    }

    private boolean a(List<g.a> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c6e0ee7", new Object[]{this, list, str})).booleanValue();
        }
        for (g.a aVar : list) {
            if (aVar != null && aVar.a(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean b(Map<String, List<g.a>> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41e3e880", new Object[]{this, map})).booleanValue() : map == null || map.size() <= 0;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(riy.BLOCK_START_STR);
        String str9 = "";
        if (this.e != null) {
            str = "pageNotInList=" + this.e;
        } else {
            str = str9;
        }
        sb.append(str);
        if (this.f != null) {
            str2 = ", triId='" + this.f;
        } else {
            str2 = str9;
        }
        sb.append(str2);
        if (this.g != null) {
            str3 = ", pageInList=" + this.g;
        } else {
            str3 = str9;
        }
        sb.append(str3);
        if (this.h != null) {
            str4 = ", arg1NotInList=" + this.h;
        } else {
            str4 = str9;
        }
        sb.append(str4);
        if (this.i != null) {
            str5 = ", arg1InList=" + this.i;
        } else {
            str5 = str9;
        }
        sb.append(str5);
        if (this.j != null) {
            str6 = ", arg2InList=" + this.j;
        } else {
            str6 = str9;
        }
        sb.append(str6);
        if (this.k != null) {
            str7 = ", arg3InList=" + this.k;
        } else {
            str7 = str9;
        }
        sb.append(str7);
        if (this.l != null) {
            str8 = ", argsNotInMap=" + this.l;
        } else {
            str8 = str9;
        }
        sb.append(str8);
        if (this.m != null) {
            str9 = ", argsInMap=" + this.m;
        }
        sb.append(str9);
        sb.append('}');
        return sb.toString();
    }

    @Override // com.tmall.android.dai.model.g
    public ArrayList<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this});
        }
        ArrayList<String> arrayList = this.n;
        if (arrayList != null) {
            return arrayList;
        }
        this.n = new ArrayList<>();
        List<g.a> list = this.g;
        if (list != null) {
            Iterator<g.a> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g.a next = it.next();
                if (!next.a()) {
                    ArrayList<String> arrayList2 = this.n;
                    arrayList2.add("" + this.f23723a + "#" + next.b());
                } else {
                    this.n.clear();
                    break;
                }
            }
        }
        if (this.n.size() == 0) {
            ArrayList<String> arrayList3 = this.n;
            arrayList3.add("" + this.f23723a);
        }
        return this.n;
    }
}
