package tb;

import com.taobao.android.remoteso.api.RSoException;
import java.util.Map;

/* loaded from: classes6.dex */
public interface ikn {
    public static final String ARGS_CALL_TYPE = "args_call_type";
    public static final String ARGS_CPU_ABI = "args_cpu_abi";
    public static final String ARGS_CPU_ABI2 = "args_cpu_abi2";
    public static final String ARGS_DOWNLOAD_DURATION = "args_download_duration";
    public static final String ARGS_EXTRACT_COMPRESSED_PATH = "args_extract_compressed_path";
    public static final String ARGS_EXTRACT_EXTRACTED_PATH = "args_extract_extracted_path";
    public static final String ARGS_FETCH_FROM = "args_fetch_from";
    public static final String ARGS_INDEX_INIT_INDEX_TOTAL = "initIndexTotal";
    public static final String ARGS_INDEX_PARSE_DATA_COST = "parseDataCost";
    public static final String ARGS_INDEX_READ_BYTES_COST = "readBytesCost";
    public static final String ARGS_INTERVAL_FROM_INIT = "args_interval_from_init";
    public static final String ARGS_LIB_NAME = "args_lib_name";
    public static final String ARGS_LOAD_FROM = "args_load_from";
    public static final String POINT_CLEANER_SPACE = "remoteso-cleaner-space";
    public static final String POINT_DOWNLOAD = "remoteso-download";
    public static final String POINT_EXTRACT = "remoteso-extract";
    public static final String POINT_FETCHER = "remoteso-fetch-new";
    public static final String POINT_INDEX = "remoteso-index";
    public static final String POINT_LOADER = "remoteso-load";
    public static final String POINT_PULLER = "remoteso-fetch";
    public static final String POINT_PULLER_ASSETS = "remoteso-pull-assets";
    public static final String POINT_SDK_INTERNAL_ERROR = "remoteso-internal";
    public static final String RSO_TRACK_MODULE = "SwallowsRemoteSo";

    /* loaded from: classes6.dex */
    public interface a {
        void a(Map<String, Object> map);
    }

    void a(String str, Map<String, Object> map);

    void a(String str, Map<String, Object> map, RSoException rSoException);

    void a(a aVar);

    void b(String str, Map<String, Object> map);
}
