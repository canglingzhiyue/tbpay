package com.taobao.live.home.view;

import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.Map;

/* loaded from: classes7.dex */
public class UTAnalyzeFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(UTAnalyzeFragment uTAnalyzeFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -1010986463) {
            super.setUserVisibleHint(((Boolean) objArr[0]).booleanValue());
            return null;
        } else if (hashCode != 797441118) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onPause();
            return null;
        }
    }

    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        return null;
    }

    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        return null;
    }

    public boolean supportUTFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("615f50a9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void visibleHint(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a7dca0", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (getUserVisibleHint()) {
            visibleHint(false, true);
        }
        if (!supportUTFragment() || !getUserVisibleHint()) {
            return;
        }
        String uTPageName = getUTPageName();
        if (!StringUtils.isEmpty(uTPageName)) {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(getActivity(), uTPageName);
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(getActivity(), uTPageName);
        }
        Map<String, String> uTProperties = getUTProperties();
        if (uTProperties == null || uTProperties.isEmpty()) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), uTProperties);
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (!getUserVisibleHint()) {
            return;
        }
        visibleHint(true, false);
    }

    @Override // android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setUserVisibleHint(z);
        visibleHint(false, z);
        if (!supportUTFragment() || !z) {
            return;
        }
        String uTPageName = getUTPageName();
        if (!StringUtils.isEmpty(uTPageName)) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getActivity());
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(getActivity(), uTPageName);
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(getActivity(), uTPageName);
        }
        Map<String, String> uTProperties = getUTProperties();
        if (uTProperties == null || uTProperties.isEmpty()) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), uTProperties);
    }

    public void updateNextPageProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6203bbc0", new Object[]{this, map});
        } else if (map == null) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        }
    }
}
