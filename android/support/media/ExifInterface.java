package android.support.media;

import android.content.res.AssetManager;
import android.util.Log;
import com.alibaba.ariver.remoterpc.EncodingUtils;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import tb.fne;
import tb.fxb;
import tb.riy;

/* loaded from: classes2.dex */
public class ExifInterface {
    private static final c A;
    public static final short ALTITUDE_ABOVE_SEA_LEVEL = 0;
    public static final short ALTITUDE_BELOW_SEA_LEVEL = 1;
    private static final HashMap<Integer, c>[] B;
    private static final HashMap<String, c>[] C;
    public static final int COLOR_SPACE_S_RGB = 1;
    public static final int COLOR_SPACE_UNCALIBRATED = 65535;
    public static final short CONTRAST_HARD = 2;
    public static final short CONTRAST_NORMAL = 0;
    public static final short CONTRAST_SOFT = 1;
    private static final HashSet<String> D;
    public static final int DATA_DEFLATE_ZIP = 8;
    public static final int DATA_HUFFMAN_COMPRESSED = 2;
    public static final int DATA_JPEG = 6;
    public static final int DATA_JPEG_COMPRESSED = 7;
    public static final int DATA_LOSSY_JPEG = 34892;
    public static final int DATA_PACK_BITS_COMPRESSED = 32773;
    public static final int DATA_UNCOMPRESSED = 1;
    private static final HashMap<Integer, Integer> E;
    public static final short EXPOSURE_MODE_AUTO = 0;
    public static final short EXPOSURE_MODE_AUTO_BRACKET = 2;
    public static final short EXPOSURE_MODE_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_ACTION = 6;
    public static final short EXPOSURE_PROGRAM_APERTURE_PRIORITY = 3;
    public static final short EXPOSURE_PROGRAM_CREATIVE = 5;
    public static final short EXPOSURE_PROGRAM_LANDSCAPE_MODE = 8;
    public static final short EXPOSURE_PROGRAM_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_NORMAL = 2;
    public static final short EXPOSURE_PROGRAM_NOT_DEFINED = 0;
    public static final short EXPOSURE_PROGRAM_PORTRAIT_MODE = 7;
    public static final short EXPOSURE_PROGRAM_SHUTTER_PRIORITY = 4;
    static final Charset F;
    public static final short FILE_SOURCE_DSC = 3;
    public static final short FILE_SOURCE_OTHER = 0;
    public static final short FILE_SOURCE_REFLEX_SCANNER = 2;
    public static final short FILE_SOURCE_TRANSPARENT_SCANNER = 1;
    public static final short FLAG_FLASH_FIRED = 1;
    public static final short FLAG_FLASH_MODE_AUTO = 24;
    public static final short FLAG_FLASH_MODE_COMPULSORY_FIRING = 8;
    public static final short FLAG_FLASH_MODE_COMPULSORY_SUPPRESSION = 16;
    public static final short FLAG_FLASH_NO_FLASH_FUNCTION = 32;
    public static final short FLAG_FLASH_RED_EYE_SUPPORTED = 64;
    public static final short FLAG_FLASH_RETURN_LIGHT_DETECTED = 6;
    public static final short FLAG_FLASH_RETURN_LIGHT_NOT_DETECTED = 4;
    public static final short FORMAT_CHUNKY = 1;
    public static final short FORMAT_PLANAR = 2;
    public static final short GAIN_CONTROL_HIGH_GAIN_DOWN = 4;
    public static final short GAIN_CONTROL_HIGH_GAIN_UP = 2;
    public static final short GAIN_CONTROL_LOW_GAIN_DOWN = 3;
    public static final short GAIN_CONTROL_LOW_GAIN_UP = 1;
    public static final short GAIN_CONTROL_NONE = 0;
    public static final String GPS_DIRECTION_MAGNETIC = "M";
    public static final String GPS_DIRECTION_TRUE = "T";
    public static final String GPS_DISTANCE_KILOMETERS = "K";
    public static final String GPS_DISTANCE_MILES = "M";
    public static final String GPS_DISTANCE_NAUTICAL_MILES = "N";
    public static final String GPS_MEASUREMENT_2D = "2";
    public static final String GPS_MEASUREMENT_3D = "3";
    public static final short GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED = 1;
    public static final String GPS_MEASUREMENT_INTERRUPTED = "V";
    public static final String GPS_MEASUREMENT_IN_PROGRESS = "A";
    public static final short GPS_MEASUREMENT_NO_DIFFERENTIAL = 0;
    public static final String GPS_SPEED_KILOMETERS_PER_HOUR = "K";
    public static final String GPS_SPEED_KNOTS = "N";
    public static final String GPS_SPEED_MILES_PER_HOUR = "M";
    public static final String LATITUDE_NORTH = "N";
    public static final String LATITUDE_SOUTH = "S";
    public static final short LIGHT_SOURCE_CLOUDY_WEATHER = 10;
    public static final short LIGHT_SOURCE_COOL_WHITE_FLUORESCENT = 14;
    public static final short LIGHT_SOURCE_D50 = 23;
    public static final short LIGHT_SOURCE_D55 = 20;
    public static final short LIGHT_SOURCE_D65 = 21;
    public static final short LIGHT_SOURCE_D75 = 22;
    public static final short LIGHT_SOURCE_DAYLIGHT = 1;
    public static final short LIGHT_SOURCE_DAYLIGHT_FLUORESCENT = 12;
    public static final short LIGHT_SOURCE_DAY_WHITE_FLUORESCENT = 13;
    public static final short LIGHT_SOURCE_FINE_WEATHER = 9;
    public static final short LIGHT_SOURCE_FLASH = 4;
    public static final short LIGHT_SOURCE_FLUORESCENT = 2;
    public static final short LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN = 24;
    public static final short LIGHT_SOURCE_OTHER = 255;
    public static final short LIGHT_SOURCE_SHADE = 11;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_A = 17;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_B = 18;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_C = 19;
    public static final short LIGHT_SOURCE_TUNGSTEN = 3;
    public static final short LIGHT_SOURCE_UNKNOWN = 0;
    public static final short LIGHT_SOURCE_WARM_WHITE_FLUORESCENT = 16;
    public static final short LIGHT_SOURCE_WHITE_FLUORESCENT = 15;
    public static final String LONGITUDE_EAST = "E";
    public static final String LONGITUDE_WEST = "W";
    public static final short METERING_MODE_AVERAGE = 1;
    public static final short METERING_MODE_CENTER_WEIGHT_AVERAGE = 2;
    public static final short METERING_MODE_MULTI_SPOT = 4;
    public static final short METERING_MODE_OTHER = 255;
    public static final short METERING_MODE_PARTIAL = 6;
    public static final short METERING_MODE_PATTERN = 5;
    public static final short METERING_MODE_SPOT = 3;
    public static final short METERING_MODE_UNKNOWN = 0;
    public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
    public static final int ORIENTATION_FLIP_VERTICAL = 4;
    public static final int ORIENTATION_NORMAL = 1;
    public static final int ORIENTATION_ROTATE_180 = 3;
    public static final int ORIENTATION_ROTATE_270 = 8;
    public static final int ORIENTATION_ROTATE_90 = 6;
    public static final int ORIENTATION_TRANSPOSE = 5;
    public static final int ORIENTATION_TRANSVERSE = 7;
    public static final int ORIENTATION_UNDEFINED = 0;
    public static final int ORIGINAL_RESOLUTION_IMAGE = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
    public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
    public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;
    public static final int REDUCED_RESOLUTION_IMAGE = 1;
    public static final short RENDERED_PROCESS_CUSTOM = 1;
    public static final short RENDERED_PROCESS_NORMAL = 0;
    public static final short RESOLUTION_UNIT_CENTIMETERS = 3;
    public static final short RESOLUTION_UNIT_INCHES = 2;
    public static final short SATURATION_HIGH = 0;
    public static final short SATURATION_LOW = 0;
    public static final short SATURATION_NORMAL = 0;
    public static final short SCENE_CAPTURE_TYPE_LANDSCAPE = 1;
    public static final short SCENE_CAPTURE_TYPE_NIGHT = 3;
    public static final short SCENE_CAPTURE_TYPE_PORTRAIT = 2;
    public static final short SCENE_CAPTURE_TYPE_STANDARD = 0;
    public static final short SCENE_TYPE_DIRECTLY_PHOTOGRAPHED = 1;
    public static final short SENSITIVITY_TYPE_ISO_SPEED = 3;
    public static final short SENSITIVITY_TYPE_REI = 2;
    public static final short SENSITIVITY_TYPE_REI_AND_ISO = 6;
    public static final short SENSITIVITY_TYPE_SOS = 1;
    public static final short SENSITIVITY_TYPE_SOS_AND_ISO = 5;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI = 4;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI_AND_ISO = 7;
    public static final short SENSITIVITY_TYPE_UNKNOWN = 0;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL = 5;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final short SENSOR_TYPE_NOT_DEFINED = 1;
    public static final short SENSOR_TYPE_ONE_CHIP = 2;
    public static final short SENSOR_TYPE_THREE_CHIP = 4;
    public static final short SENSOR_TYPE_TRILINEAR = 7;
    public static final short SENSOR_TYPE_TWO_CHIP = 3;
    public static final short SHARPNESS_HARD = 2;
    public static final short SHARPNESS_NORMAL = 0;
    public static final short SHARPNESS_SOFT = 1;
    public static final short SUBJECT_DISTANCE_RANGE_CLOSE_VIEW = 2;
    public static final short SUBJECT_DISTANCE_RANGE_DISTANT_VIEW = 3;
    public static final short SUBJECT_DISTANCE_RANGE_MACRO = 1;
    public static final short SUBJECT_DISTANCE_RANGE_UNKNOWN = 0;
    public static final String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
    public static final String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_GAMMA = "Gamma";
    public static final String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
    public static final String TAG_ISO_SPEED = "ISOSpeed";
    public static final String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
    public static final String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";
    @Deprecated
    public static final String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
    public static final String TAG_LENS_MAKE = "LensMake";
    public static final String TAG_LENS_MODEL = "LensModel";
    public static final String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
    public static final String TAG_LENS_SPECIFICATION = "LensSpecification";
    public static final String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
    public static final String TAG_SENSITIVITY_TYPE = "SensitivityType";
    public static final String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
    private static final Pattern W;
    @Deprecated
    public static final int WHITEBALANCE_AUTO = 0;
    @Deprecated
    public static final int WHITEBALANCE_MANUAL = 1;
    public static final short WHITE_BALANCE_AUTO = 0;
    public static final short WHITE_BALANCE_MANUAL = 1;
    private static final Pattern X;
    public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
    public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;
    static final c[][] d;
    static final byte[] e;
    private static SimpleDateFormat j;
    private static final c[] y;
    private static final c z;
    private final String G;
    private final AssetManager.AssetInputStream H;
    private int I;
    private final HashMap<String, b>[] J;
    private ByteOrder K;
    private boolean L;
    private int M;
    private int N;
    private byte[] O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private Set<Integer> Y;
    private static final List<Integer> f = Arrays.asList(1, 6, 3, 8);
    private static final List<Integer> g = Arrays.asList(2, 7, 4, 5);
    public static final int[] l = {8, 8, 8};
    public static final int[] m = {4};
    public static final int[] n = {8};

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f1231a = {-1, -40, -1};
    private static final byte[] h = {79, 76, 89, 77, 80, 0};
    private static final byte[] i = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    static final String[] b = {"", "BYTE", fne.TYPE_STRING, "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", fne.TYPE_DOUBLE};
    static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] k = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
    public static final String TAG_SUBFILE_TYPE = "SubfileType";
    public static final String TAG_IMAGE_WIDTH = "ImageWidth";
    public static final String TAG_IMAGE_LENGTH = "ImageLength";
    public static final String TAG_BITS_PER_SAMPLE = "BitsPerSample";
    public static final String TAG_COMPRESSION = "Compression";
    public static final String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
    public static final String TAG_IMAGE_DESCRIPTION = "ImageDescription";
    public static final String TAG_MAKE = "Make";
    public static final String TAG_MODEL = "Model";
    public static final String TAG_STRIP_OFFSETS = "StripOffsets";
    public static final String TAG_ORIENTATION = "Orientation";
    public static final String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
    public static final String TAG_ROWS_PER_STRIP = "RowsPerStrip";
    public static final String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
    public static final String TAG_X_RESOLUTION = "XResolution";
    public static final String TAG_Y_RESOLUTION = "YResolution";
    public static final String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
    public static final String TAG_RESOLUTION_UNIT = "ResolutionUnit";
    public static final String TAG_TRANSFER_FUNCTION = "TransferFunction";
    public static final String TAG_SOFTWARE = "Software";
    public static final String TAG_DATETIME = "DateTime";
    public static final String TAG_ARTIST = "Artist";
    public static final String TAG_WHITE_POINT = "WhitePoint";
    public static final String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
    public static final String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
    public static final String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
    public static final String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
    public static final String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
    public static final String TAG_COPYRIGHT = "Copyright";
    public static final String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
    public static final String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
    public static final String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
    public static final String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
    public static final String TAG_RW2_ISO = "ISO";
    public static final String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
    private static final c[] o = {new c(TAG_NEW_SUBFILE_TYPE, 254, 4), new c(TAG_SUBFILE_TYPE, 255, 4), new c(TAG_IMAGE_WIDTH, 256, 3, 4), new c(TAG_IMAGE_LENGTH, 257, 3, 4), new c(TAG_BITS_PER_SAMPLE, 258, 3), new c(TAG_COMPRESSION, com.taobao.global.setting.data.c.ERROR_MTOP_SERVICE_EXCEPTION, 3), new c(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new c(TAG_IMAGE_DESCRIPTION, 270, 2), new c(TAG_MAKE, 271, 2), new c(TAG_MODEL, Result.ALIPAY_BASE64_ENCODE_ERROR, 2), new c(TAG_STRIP_OFFSETS, Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR, 3, 4), new c(TAG_ORIENTATION, Result.ALIPAY_PARAM_INVALID, 3), new c(TAG_SAMPLES_PER_PIXEL, Result.ALIPAY_GET_FP_INDEX_FAILED, 3), new c(TAG_ROWS_PER_STRIP, Result.ALIPAY_GENERATE_REG_NODE_FAILED, 3, 4), new c(TAG_STRIP_BYTE_COUNTS, Result.ALIPAY_VERIFY_REG_NODE_FAILED, 3, 4), new c(TAG_X_RESOLUTION, 282, 5), new c(TAG_Y_RESOLUTION, 283, 5), new c(TAG_PLANAR_CONFIGURATION, 284, 3), new c(TAG_RESOLUTION_UNIT, Result.ALIPAY_TEE_ERROR_ITEM_NOT_FOUND, 3), new c(TAG_TRANSFER_FUNCTION, 301, 3), new c(TAG_SOFTWARE, 305, 2), new c(TAG_DATETIME, 306, 2), new c(TAG_ARTIST, 315, 2), new c(TAG_WHITE_POINT, 318, 5), new c(TAG_PRIMARY_CHROMATICITIES, 319, 5), new c("SubIFDPointer", 330, 4), new c(TAG_JPEG_INTERCHANGE_FORMAT, 513, 4), new c(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4), new c(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new c(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new c(TAG_Y_CB_CR_POSITIONING, 531, 3), new c(TAG_REFERENCE_BLACK_WHITE, 532, 5), new c(TAG_COPYRIGHT, 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c(TAG_RW2_SENSOR_TOP_BORDER, 4, 4), new c(TAG_RW2_SENSOR_LEFT_BORDER, 5, 4), new c(TAG_RW2_SENSOR_BOTTOM_BORDER, 6, 4), new c(TAG_RW2_SENSOR_RIGHT_BORDER, 7, 4), new c(TAG_RW2_ISO, 23, 3), new c(TAG_RW2_JPG_FROM_RAW, 46, 7)};
    public static final String TAG_EXPOSURE_TIME = "ExposureTime";
    public static final String TAG_F_NUMBER = "FNumber";
    public static final String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
    public static final String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
    public static final String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
    public static final String TAG_OECF = "OECF";
    public static final String TAG_EXIF_VERSION = "ExifVersion";
    public static final String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
    public static final String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
    public static final String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
    public static final String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
    public static final String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
    public static final String TAG_APERTURE_VALUE = "ApertureValue";
    public static final String TAG_BRIGHTNESS_VALUE = "BrightnessValue";
    public static final String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
    public static final String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
    public static final String TAG_SUBJECT_DISTANCE = "SubjectDistance";
    public static final String TAG_METERING_MODE = "MeteringMode";
    public static final String TAG_LIGHT_SOURCE = "LightSource";
    public static final String TAG_FLASH = "Flash";
    public static final String TAG_FOCAL_LENGTH = "FocalLength";
    public static final String TAG_SUBJECT_AREA = "SubjectArea";
    public static final String TAG_MAKER_NOTE = "MakerNote";
    public static final String TAG_USER_COMMENT = "UserComment";
    public static final String TAG_SUBSEC_TIME = "SubSecTime";
    public static final String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
    public static final String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
    public static final String TAG_FLASHPIX_VERSION = "FlashpixVersion";
    public static final String TAG_COLOR_SPACE = "ColorSpace";
    public static final String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
    public static final String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
    public static final String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
    public static final String TAG_FLASH_ENERGY = "FlashEnergy";
    public static final String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
    public static final String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
    public static final String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
    public static final String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
    public static final String TAG_SUBJECT_LOCATION = "SubjectLocation";
    public static final String TAG_EXPOSURE_INDEX = "ExposureIndex";
    public static final String TAG_SENSING_METHOD = "SensingMethod";
    public static final String TAG_FILE_SOURCE = "FileSource";
    public static final String TAG_SCENE_TYPE = "SceneType";
    public static final String TAG_CFA_PATTERN = "CFAPattern";
    public static final String TAG_CUSTOM_RENDERED = "CustomRendered";
    public static final String TAG_EXPOSURE_MODE = "ExposureMode";
    public static final String TAG_WHITE_BALANCE = "WhiteBalance";
    public static final String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
    public static final String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
    public static final String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
    public static final String TAG_GAIN_CONTROL = "GainControl";
    public static final String TAG_CONTRAST = "Contrast";
    public static final String TAG_SATURATION = "Saturation";
    public static final String TAG_SHARPNESS = "Sharpness";
    public static final String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
    public static final String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
    public static final String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
    public static final String TAG_DNG_VERSION = "DNGVersion";
    public static final String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
    private static final c[] p = {new c(TAG_EXPOSURE_TIME, 33434, 5), new c(TAG_F_NUMBER, 33437, 5), new c(TAG_EXPOSURE_PROGRAM, 34850, 3), new c(TAG_SPECTRAL_SENSITIVITY, 34852, 2), new c(TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new c(TAG_OECF, 34856, 7), new c(TAG_EXIF_VERSION, 36864, 2), new c(TAG_DATETIME_ORIGINAL, 36867, 2), new c(TAG_DATETIME_DIGITIZED, 36868, 2), new c(TAG_COMPONENTS_CONFIGURATION, 37121, 7), new c(TAG_COMPRESSED_BITS_PER_PIXEL, 37122, 5), new c(TAG_SHUTTER_SPEED_VALUE, 37377, 10), new c(TAG_APERTURE_VALUE, 37378, 5), new c(TAG_BRIGHTNESS_VALUE, 37379, 10), new c(TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new c(TAG_MAX_APERTURE_VALUE, 37381, 5), new c(TAG_SUBJECT_DISTANCE, 37382, 5), new c(TAG_METERING_MODE, 37383, 3), new c(TAG_LIGHT_SOURCE, 37384, 3), new c(TAG_FLASH, 37385, 3), new c(TAG_FOCAL_LENGTH, 37386, 5), new c(TAG_SUBJECT_AREA, 37396, 3), new c(TAG_MAKER_NOTE, 37500, 7), new c(TAG_USER_COMMENT, 37510, 7), new c(TAG_SUBSEC_TIME, 37520, 2), new c(TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new c(TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new c(TAG_FLASHPIX_VERSION, 40960, 7), new c(TAG_COLOR_SPACE, 40961, 3), new c(TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new c(TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new c(TAG_RELATED_SOUND_FILE, 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c(TAG_FLASH_ENERGY, 41483, 5), new c(TAG_SPATIAL_FREQUENCY_RESPONSE, 41484, 7), new c(TAG_FOCAL_PLANE_X_RESOLUTION, 41486, 5), new c(TAG_FOCAL_PLANE_Y_RESOLUTION, 41487, 5), new c(TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new c(TAG_SUBJECT_LOCATION, 41492, 3), new c(TAG_EXPOSURE_INDEX, 41493, 5), new c(TAG_SENSING_METHOD, 41495, 3), new c(TAG_FILE_SOURCE, 41728, 7), new c(TAG_SCENE_TYPE, 41729, 7), new c(TAG_CFA_PATTERN, 41730, 7), new c(TAG_CUSTOM_RENDERED, 41985, 3), new c(TAG_EXPOSURE_MODE, 41986, 3), new c(TAG_WHITE_BALANCE, 41987, 3), new c(TAG_DIGITAL_ZOOM_RATIO, 41988, 5), new c(TAG_FOCAL_LENGTH_IN_35MM_FILM, 41989, 3), new c(TAG_SCENE_CAPTURE_TYPE, 41990, 3), new c(TAG_GAIN_CONTROL, 41991, 3), new c(TAG_CONTRAST, 41992, 3), new c(TAG_SATURATION, 41993, 3), new c(TAG_SHARPNESS, 41994, 3), new c(TAG_DEVICE_SETTING_DESCRIPTION, 41995, 7), new c(TAG_SUBJECT_DISTANCE_RANGE, 41996, 3), new c(TAG_IMAGE_UNIQUE_ID, 42016, 2), new c(TAG_DNG_VERSION, 50706, 1), new c(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
    public static final String TAG_GPS_VERSION_ID = "GPSVersionID";
    public static final String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
    public static final String TAG_GPS_LATITUDE = "GPSLatitude";
    public static final String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
    public static final String TAG_GPS_LONGITUDE = "GPSLongitude";
    public static final String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
    public static final String TAG_GPS_ALTITUDE = "GPSAltitude";
    public static final String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
    public static final String TAG_GPS_SATELLITES = "GPSSatellites";
    public static final String TAG_GPS_STATUS = "GPSStatus";
    public static final String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
    public static final String TAG_GPS_DOP = "GPSDOP";
    public static final String TAG_GPS_SPEED_REF = "GPSSpeedRef";
    public static final String TAG_GPS_SPEED = "GPSSpeed";
    public static final String TAG_GPS_TRACK_REF = "GPSTrackRef";
    public static final String TAG_GPS_TRACK = "GPSTrack";
    public static final String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
    public static final String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
    public static final String TAG_GPS_MAP_DATUM = "GPSMapDatum";
    public static final String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
    public static final String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
    public static final String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
    public static final String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
    public static final String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
    public static final String TAG_GPS_DEST_BEARING = "GPSDestBearing";
    public static final String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
    public static final String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
    public static final String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
    public static final String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
    public static final String TAG_GPS_DATESTAMP = "GPSDateStamp";
    public static final String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
    private static final c[] q = {new c(TAG_GPS_VERSION_ID, 0, 1), new c(TAG_GPS_LATITUDE_REF, 1, 2), new c(TAG_GPS_LATITUDE, 2, 5), new c(TAG_GPS_LONGITUDE_REF, 3, 2), new c(TAG_GPS_LONGITUDE, 4, 5), new c(TAG_GPS_ALTITUDE_REF, 5, 1), new c(TAG_GPS_ALTITUDE, 6, 5), new c(TAG_GPS_TIMESTAMP, 7, 5), new c(TAG_GPS_SATELLITES, 8, 2), new c(TAG_GPS_STATUS, 9, 2), new c(TAG_GPS_MEASURE_MODE, 10, 2), new c(TAG_GPS_DOP, 11, 5), new c(TAG_GPS_SPEED_REF, 12, 2), new c(TAG_GPS_SPEED, 13, 5), new c(TAG_GPS_TRACK_REF, 14, 2), new c(TAG_GPS_TRACK, 15, 5), new c(TAG_GPS_IMG_DIRECTION_REF, 16, 2), new c(TAG_GPS_IMG_DIRECTION, 17, 5), new c(TAG_GPS_MAP_DATUM, 18, 2), new c(TAG_GPS_DEST_LATITUDE_REF, 19, 2), new c(TAG_GPS_DEST_LATITUDE, 20, 5), new c(TAG_GPS_DEST_LONGITUDE_REF, 21, 2), new c(TAG_GPS_DEST_LONGITUDE, 22, 5), new c(TAG_GPS_DEST_BEARING_REF, 23, 2), new c(TAG_GPS_DEST_BEARING, 24, 5), new c(TAG_GPS_DEST_DISTANCE_REF, 25, 2), new c(TAG_GPS_DEST_DISTANCE, 26, 5), new c(TAG_GPS_PROCESSING_METHOD, 27, 7), new c(TAG_GPS_AREA_INFORMATION, 28, 7), new c(TAG_GPS_DATESTAMP, 29, 2), new c(TAG_GPS_DIFFERENTIAL, 30, 3)};
    public static final String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
    private static final c[] r = {new c(TAG_INTEROPERABILITY_INDEX, 1, 2)};
    public static final String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";
    public static final String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
    private static final c[] s = {new c(TAG_NEW_SUBFILE_TYPE, 254, 4), new c(TAG_SUBFILE_TYPE, 255, 4), new c(TAG_THUMBNAIL_IMAGE_WIDTH, 256, 3, 4), new c(TAG_THUMBNAIL_IMAGE_LENGTH, 257, 3, 4), new c(TAG_BITS_PER_SAMPLE, 258, 3), new c(TAG_COMPRESSION, com.taobao.global.setting.data.c.ERROR_MTOP_SERVICE_EXCEPTION, 3), new c(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new c(TAG_IMAGE_DESCRIPTION, 270, 2), new c(TAG_MAKE, 271, 2), new c(TAG_MODEL, Result.ALIPAY_BASE64_ENCODE_ERROR, 2), new c(TAG_STRIP_OFFSETS, Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR, 3, 4), new c(TAG_ORIENTATION, Result.ALIPAY_PARAM_INVALID, 3), new c(TAG_SAMPLES_PER_PIXEL, Result.ALIPAY_GET_FP_INDEX_FAILED, 3), new c(TAG_ROWS_PER_STRIP, Result.ALIPAY_GENERATE_REG_NODE_FAILED, 3, 4), new c(TAG_STRIP_BYTE_COUNTS, Result.ALIPAY_VERIFY_REG_NODE_FAILED, 3, 4), new c(TAG_X_RESOLUTION, 282, 5), new c(TAG_Y_RESOLUTION, 283, 5), new c(TAG_PLANAR_CONFIGURATION, 284, 3), new c(TAG_RESOLUTION_UNIT, Result.ALIPAY_TEE_ERROR_ITEM_NOT_FOUND, 3), new c(TAG_TRANSFER_FUNCTION, 301, 3), new c(TAG_SOFTWARE, 305, 2), new c(TAG_DATETIME, 306, 2), new c(TAG_ARTIST, 315, 2), new c(TAG_WHITE_POINT, 318, 5), new c(TAG_PRIMARY_CHROMATICITIES, 319, 5), new c("SubIFDPointer", 330, 4), new c(TAG_JPEG_INTERCHANGE_FORMAT, 513, 4), new c(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4), new c(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new c(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new c(TAG_Y_CB_CR_POSITIONING, 531, 3), new c(TAG_REFERENCE_BLACK_WHITE, 532, 5), new c(TAG_COPYRIGHT, 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c(TAG_DNG_VERSION, 50706, 1), new c(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
    private static final c t = new c(TAG_STRIP_OFFSETS, Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR, 3);
    public static final String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
    private static final c[] u = {new c(TAG_ORF_THUMBNAIL_IMAGE, 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)};
    public static final String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
    public static final String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
    private static final c[] v = {new c(TAG_ORF_PREVIEW_IMAGE_START, 257, 4), new c(TAG_ORF_PREVIEW_IMAGE_LENGTH, 258, 4)};
    public static final String TAG_ORF_ASPECT_FRAME = "AspectFrame";
    private static final c[] w = {new c(TAG_ORF_ASPECT_FRAME, 4371, 3)};
    private static final c[] x = {new c(TAG_COLOR_SPACE, 55, 3)};

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface IfdType {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a extends InputStream implements DataInput {

        /* renamed from: a  reason: collision with root package name */
        private static final ByteOrder f1232a = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder b = ByteOrder.BIG_ENDIAN;
        private DataInputStream c;
        private ByteOrder d;
        final int e;
        int f;

        public a(InputStream inputStream) throws IOException {
            this.d = ByteOrder.BIG_ENDIAN;
            this.c = new DataInputStream(inputStream);
            this.e = this.c.available();
            this.f = 0;
            this.c.mark(this.e);
        }

        public a(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }

        public int a() {
            return this.f;
        }

        public void a(long j) throws IOException {
            int i = this.f;
            if (i > j) {
                this.f = 0;
                this.c.reset();
                this.c.mark(this.e);
            } else {
                j -= i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) == i2) {
                return;
            }
            throw new IOException("Couldn't seek up to the byteCount");
        }

        public void a(ByteOrder byteOrder) {
            this.d = byteOrder;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.c.available();
        }

        public long b() throws IOException {
            return readInt() & 4294967295L;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f++;
            return this.c.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.c.read(bArr, i, i2);
            this.f += read;
            return read;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f++;
            return this.c.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f++;
            if (this.f <= this.e) {
                int read = this.c.read();
                if (read < 0) {
                    throw new EOFException();
                }
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f += 2;
            return this.c.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f += bArr.length;
            if (this.f <= this.e) {
                if (this.c.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.f += i2;
            if (this.f <= this.e) {
                if (this.c.read(bArr, i, i2) != i2) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f += 4;
            if (this.f <= this.e) {
                int read = this.c.read();
                int read2 = this.c.read();
                int read3 = this.c.read();
                int read4 = this.c.read();
                if ((read | read2 | read3 | read4) < 0) {
                    throw new EOFException();
                }
                ByteOrder byteOrder = this.d;
                if (byteOrder == f1232a) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == b) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.d);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f += 8;
            if (this.f <= this.e) {
                int read = this.c.read();
                int read2 = this.c.read();
                int read3 = this.c.read();
                int read4 = this.c.read();
                int read5 = this.c.read();
                int read6 = this.c.read();
                int read7 = this.c.read();
                int read8 = this.c.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                    throw new EOFException();
                }
                ByteOrder byteOrder = this.d;
                if (byteOrder == f1232a) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == b) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.d);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f += 2;
            if (this.f <= this.e) {
                int read = this.c.read();
                int read2 = this.c.read();
                if ((read | read2) < 0) {
                    throw new EOFException();
                }
                ByteOrder byteOrder = this.d;
                if (byteOrder == f1232a) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == b) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.d);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f += 2;
            return this.c.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f++;
            return this.c.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f += 2;
            if (this.f <= this.e) {
                int read = this.c.read();
                int read2 = this.c.read();
                if ((read | read2) < 0) {
                    throw new EOFException();
                }
                ByteOrder byteOrder = this.d;
                if (byteOrder == f1232a) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == b) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.d);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.e - this.f);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.c.skipBytes(min - i2);
            }
            this.f += i2;
            return i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f1233a;
        public final int b;
        public final byte[] c;

        b(int i, int i2, byte[] bArr) {
            this.f1233a = i;
            this.b = i2;
            this.c = bArr;
        }

        public static b a(int i, ByteOrder byteOrder) {
            return a(new int[]{i}, byteOrder);
        }

        public static b a(long j, ByteOrder byteOrder) {
            return a(new long[]{j}, byteOrder);
        }

        public static b a(d dVar, ByteOrder byteOrder) {
            return a(new d[]{dVar}, byteOrder);
        }

        public static b a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(ExifInterface.F);
            return new b(2, bytes.length, bytes);
        }

        public static b a(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.c[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new b(3, iArr.length, wrap.array());
        }

        public static b a(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.c[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new b(4, jArr.length, wrap.array());
        }

        public static b a(d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.c[5] * dVarArr.length]);
            wrap.order(byteOrder);
            for (d dVar : dVarArr) {
                wrap.putInt((int) dVar.f1235a);
                wrap.putInt((int) dVar.b);
            }
            return new b(5, dVarArr.length, wrap.array());
        }

        public double a(ByteOrder byteOrder) {
            Object d = d(byteOrder);
            if (d != null) {
                if (d instanceof String) {
                    return Double.parseDouble((String) d);
                }
                if (d instanceof long[]) {
                    long[] jArr = (long[]) d;
                    if (jArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return jArr[0];
                } else if (d instanceof int[]) {
                    int[] iArr = (int[]) d;
                    if (iArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return iArr[0];
                } else if (d instanceof double[]) {
                    double[] dArr = (double[]) d;
                    if (dArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return dArr[0];
                } else if (!(d instanceof d[])) {
                    throw new NumberFormatException("Couldn't find a double value");
                } else {
                    d[] dVarArr = (d[]) d;
                    if (dVarArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return dVarArr[0].a();
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int b(ByteOrder byteOrder) {
            Object d = d(byteOrder);
            if (d != null) {
                if (d instanceof String) {
                    return Integer.parseInt((String) d);
                }
                if (d instanceof long[]) {
                    long[] jArr = (long[]) d;
                    if (jArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return (int) jArr[0];
                } else if (!(d instanceof int[])) {
                    throw new NumberFormatException("Couldn't find a integer value");
                } else {
                    int[] iArr = (int[]) d;
                    if (iArr.length != 1) {
                        throw new NumberFormatException("There are more than one component");
                    }
                    return iArr[0];
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String c(ByteOrder byteOrder) {
            Object d = d(byteOrder);
            if (d == null) {
                return null;
            }
            if (d instanceof String) {
                return (String) d;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (d instanceof long[]) {
                long[] jArr = (long[]) d;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (d instanceof int[]) {
                int[] iArr = (int[]) d;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (d instanceof double[]) {
                double[] dArr = (double[]) d;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(d instanceof d[])) {
                return null;
            } else {
                d[] dVarArr = (d[]) d;
                while (i < dVarArr.length) {
                    sb.append(dVarArr[i].f1235a);
                    sb.append(fxb.DIR);
                    sb.append(dVarArr[i].b);
                    i++;
                    if (i != dVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        Object d(ByteOrder byteOrder) {
            a aVar;
            byte b;
            try {
                aVar = new a(this.c);
            } catch (IOException unused) {
                aVar = null;
            } catch (Throwable th) {
                th = th;
                aVar = null;
            }
            try {
                aVar.a(byteOrder);
                boolean z = true;
                int i = 0;
                switch (this.f1233a) {
                    case 1:
                    case 6:
                        if (this.c.length != 1 || this.c[0] < 0 || this.c[0] > 1) {
                            String str = new String(this.c, ExifInterface.F);
                            try {
                                aVar.close();
                            } catch (IOException e) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                            }
                            return str;
                        }
                        String str2 = new String(new char[]{(char) (this.c[0] + 48)});
                        try {
                            aVar.close();
                        } catch (IOException e2) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                        }
                        return str2;
                    case 2:
                    case 7:
                        if (this.b >= ExifInterface.k.length) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < ExifInterface.k.length) {
                                    if (this.c[i2] != ExifInterface.k[i2]) {
                                        z = false;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            if (z) {
                                i = ExifInterface.k.length;
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        while (i < this.b && (b = this.c[i]) != 0) {
                            if (b >= 32) {
                                sb.append((char) b);
                            } else {
                                sb.append(riy.CONDITION_IF);
                            }
                            i++;
                        }
                        String sb2 = sb.toString();
                        try {
                            aVar.close();
                        } catch (IOException e3) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                        }
                        return sb2;
                    case 3:
                        int[] iArr = new int[this.b];
                        while (i < this.b) {
                            iArr[i] = aVar.readUnsignedShort();
                            i++;
                        }
                        try {
                            aVar.close();
                        } catch (IOException e4) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                        }
                        return iArr;
                    case 4:
                        long[] jArr = new long[this.b];
                        while (i < this.b) {
                            jArr[i] = aVar.b();
                            i++;
                        }
                        try {
                            aVar.close();
                        } catch (IOException e5) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                        }
                        return jArr;
                    case 5:
                        d[] dVarArr = new d[this.b];
                        while (i < this.b) {
                            dVarArr[i] = new d(aVar.b(), aVar.b());
                            i++;
                        }
                        try {
                            aVar.close();
                        } catch (IOException e6) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                        }
                        return dVarArr;
                    case 8:
                        int[] iArr2 = new int[this.b];
                        while (i < this.b) {
                            iArr2[i] = aVar.readShort();
                            i++;
                        }
                        try {
                            aVar.close();
                        } catch (IOException e7) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                        }
                        return iArr2;
                    case 9:
                        int[] iArr3 = new int[this.b];
                        while (i < this.b) {
                            iArr3[i] = aVar.readInt();
                            i++;
                        }
                        try {
                            aVar.close();
                        } catch (IOException e8) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                        }
                        return iArr3;
                    case 10:
                        d[] dVarArr2 = new d[this.b];
                        while (i < this.b) {
                            dVarArr2[i] = new d(aVar.readInt(), aVar.readInt());
                            i++;
                        }
                        try {
                            aVar.close();
                        } catch (IOException e9) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                        }
                        return dVarArr2;
                    case 11:
                        double[] dArr = new double[this.b];
                        while (i < this.b) {
                            dArr[i] = aVar.readFloat();
                            i++;
                        }
                        try {
                            aVar.close();
                        } catch (IOException e10) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                        }
                        return dArr;
                    case 12:
                        double[] dArr2 = new double[this.b];
                        while (i < this.b) {
                            dArr2[i] = aVar.readDouble();
                            i++;
                        }
                        try {
                            aVar.close();
                        } catch (IOException e11) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                        }
                        return dArr2;
                    default:
                        try {
                            aVar.close();
                        } catch (IOException e12) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                        }
                        return null;
                }
            } catch (IOException unused2) {
                if (aVar != null) {
                    try {
                        aVar.close();
                    } catch (IOException e13) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (aVar != null) {
                    try {
                        aVar.close();
                    } catch (IOException e14) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                    }
                }
                throw th;
            }
        }

        public String toString() {
            return riy.BRACKET_START_STR + ExifInterface.b[this.f1233a] + ", data length:" + this.c.length + riy.BRACKET_END_STR;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f1234a;
        public final String b;
        public final int c;
        public final int d;

        c(String str, int i, int i2) {
            this.b = str;
            this.f1234a = i;
            this.c = i2;
            this.d = -1;
        }

        c(String str, int i, int i2, int i3) {
            this.b = str;
            this.f1234a = i;
            this.c = i2;
            this.d = i3;
        }

        boolean a(int i) {
            int i2;
            int i3 = this.c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((this.c == 9 || this.d == 9) && i == 8) {
                return true;
            }
            return (this.c == 12 || this.d == 12) && i == 11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f1235a;
        public final long b;

        d(long j, long j2) {
            if (j2 == 0) {
                this.f1235a = 0L;
                this.b = 1L;
                return;
            }
            this.f1235a = j;
            this.b = j2;
        }

        public double a() {
            return this.f1235a / this.b;
        }

        public String toString() {
            return this.f1235a + "/" + this.b;
        }
    }

    static {
        c[] cVarArr;
        c[] cVarArr2 = o;
        d = new c[][]{cVarArr2, p, q, r, s, cVarArr2, u, v, w, x};
        y = new c[]{new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
        z = new c(TAG_JPEG_INTERCHANGE_FORMAT, 513, 4);
        A = new c(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4);
        c[][] cVarArr3 = d;
        B = new HashMap[cVarArr3.length];
        C = new HashMap[cVarArr3.length];
        D = new HashSet<>(Arrays.asList(TAG_F_NUMBER, TAG_DIGITAL_ZOOM_RATIO, TAG_EXPOSURE_TIME, TAG_SUBJECT_DISTANCE, TAG_GPS_TIMESTAMP));
        E = new HashMap<>();
        F = Charset.forName(EncodingUtils.US_ASCII);
        e = "Exif\u0000\u0000".getBytes(F);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        j = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(com.taobao.android.weex_framework.util.a.ATOM_EXT_UTC));
        for (int i2 = 0; i2 < d.length; i2++) {
            B[i2] = new HashMap<>();
            C[i2] = new HashMap<>();
            for (c cVar : d[i2]) {
                B[i2].put(Integer.valueOf(cVar.f1234a), cVar);
                C[i2].put(cVar.b, cVar);
            }
        }
        E.put(Integer.valueOf(y[0].f1234a), 5);
        E.put(Integer.valueOf(y[1].f1234a), 1);
        E.put(Integer.valueOf(y[2].f1234a), 2);
        E.put(Integer.valueOf(y[3].f1234a), 3);
        E.put(Integer.valueOf(y[4].f1234a), 7);
        E.put(Integer.valueOf(y[5].f1234a), 8);
        W = Pattern.compile(".*[1-9].*");
        X = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    public ExifInterface(InputStream inputStream) throws IOException {
        c[][] cVarArr = d;
        this.J = new HashMap[cVarArr.length];
        this.Y = new HashSet(cVarArr.length);
        this.K = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            AssetManager.AssetInputStream assetInputStream = null;
            this.G = null;
            this.H = inputStream instanceof AssetManager.AssetInputStream ? (AssetManager.AssetInputStream) inputStream : assetInputStream;
            a(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }

    public ExifInterface(String str) throws IOException {
        FileInputStream fileInputStream;
        c[][] cVarArr = d;
        this.J = new HashMap[cVarArr.length];
        this.Y = new HashSet(cVarArr.length);
        this.K = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream2 = null;
            this.H = null;
            this.G = str;
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                a((InputStream) fileInputStream);
                a((Closeable) fileInputStream);
                return;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                a((Closeable) fileInputStream2);
                throw th;
            }
        }
        throw new IllegalArgumentException("filename cannot be null");
    }

    private int a(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (a(bArr)) {
            return 4;
        }
        if (b(bArr)) {
            return 9;
        }
        if (c(bArr)) {
            return 7;
        }
        return d(bArr) ? 10 : 0;
    }

    private void a(int i2, int i3) throws IOException {
        if (this.J[i2].isEmpty() || this.J[i3].isEmpty()) {
            return;
        }
        b bVar = this.J[i2].get(TAG_IMAGE_LENGTH);
        b bVar2 = this.J[i2].get(TAG_IMAGE_WIDTH);
        b bVar3 = this.J[i3].get(TAG_IMAGE_LENGTH);
        b bVar4 = this.J[i3].get(TAG_IMAGE_WIDTH);
        if (bVar == null || bVar2 == null || bVar3 == null || bVar4 == null) {
            return;
        }
        int b2 = bVar.b(this.K);
        int b3 = bVar2.b(this.K);
        int b4 = bVar3.b(this.K);
        int b5 = bVar4.b(this.K);
        if (b2 >= b4 || b3 >= b5) {
            return;
        }
        HashMap<String, b>[] hashMapArr = this.J;
        HashMap<String, b> hashMap = hashMapArr[i2];
        hashMapArr[i2] = hashMapArr[i3];
        hashMapArr[i3] = hashMap;
    }

    private void a(a aVar) throws IOException {
        b bVar;
        a(aVar, aVar.available());
        b(aVar, 0);
        d(aVar, 0);
        d(aVar, 5);
        d(aVar, 4);
        b((InputStream) aVar);
        if (this.I != 8 || (bVar = this.J[1].get(TAG_MAKER_NOTE)) == null) {
            return;
        }
        a aVar2 = new a(bVar.c);
        aVar2.a(this.K);
        aVar2.a(6L);
        b(aVar2, 9);
        b bVar2 = this.J[9].get(TAG_COLOR_SPACE);
        if (bVar2 == null) {
            return;
        }
        this.J[1].put(TAG_COLOR_SPACE, bVar2);
    }

    private void a(a aVar, int i2) throws IOException {
        this.K = e(aVar);
        aVar.a(this.K);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i3 = this.I;
        if (i3 != 7 && i3 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = aVar.readInt();
        if (readInt < 8 || readInt >= i2) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i4 = readInt - 8;
        if (i4 <= 0 || aVar.skipBytes(i4) == i4) {
            return;
        }
        throw new IOException("Couldn't jump to first Ifd: " + i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0111, code lost:
        r10.a(r9.K);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0116, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.support.media.ExifInterface.a r10, int r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.media.ExifInterface.a(android.support.media.ExifInterface$a, int, int):void");
    }

    private void a(a aVar, HashMap hashMap) throws IOException {
        int i2;
        b bVar = (b) hashMap.get(TAG_JPEG_INTERCHANGE_FORMAT);
        b bVar2 = (b) hashMap.get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
        if (bVar == null || bVar2 == null) {
            return;
        }
        int b2 = bVar.b(this.K);
        int min = Math.min(bVar2.b(this.K), aVar.available() - b2);
        int i3 = this.I;
        if (i3 != 4 && i3 != 9 && i3 != 10) {
            if (i3 == 7) {
                i2 = this.R;
            }
            if (b2 <= 0 || min <= 0) {
            }
            this.L = true;
            this.M = b2;
            this.N = min;
            if (this.G != null || this.H != null) {
                return;
            }
            byte[] bArr = new byte[min];
            aVar.a(b2);
            aVar.readFully(bArr);
            this.O = bArr;
            return;
        }
        i2 = this.Q;
        b2 += i2;
        if (b2 <= 0) {
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private void a(InputStream inputStream) throws IOException {
        for (int i2 = 0; i2 < d.length; i2++) {
            try {
                this.J[i2] = new HashMap<>();
            } catch (IOException unused) {
                this.V = false;
                return;
            } finally {
                c();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.I = a(bufferedInputStream);
        a aVar = new a(bufferedInputStream);
        switch (this.I) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                a(aVar);
                break;
            case 4:
                a(aVar, 0, 0);
                break;
            case 7:
                c(aVar);
                break;
            case 9:
                b(aVar);
                break;
            case 10:
                d(aVar);
                break;
        }
        f(aVar);
        this.V = true;
    }

    private void a(byte[] bArr, int i2) throws IOException {
        a aVar = new a(bArr);
        a(aVar, bArr.length);
        b(aVar, i2);
    }

    private boolean a(HashMap hashMap) throws IOException {
        b bVar;
        b bVar2 = (b) hashMap.get(TAG_BITS_PER_SAMPLE);
        if (bVar2 != null) {
            int[] iArr = (int[]) bVar2.d(this.K);
            if (Arrays.equals(l, iArr)) {
                return true;
            }
            if (this.I != 3 || (bVar = (b) hashMap.get(TAG_PHOTOMETRIC_INTERPRETATION)) == null) {
                return false;
            }
            int b2 = bVar.b(this.K);
            return (b2 == 1 && Arrays.equals(iArr, n)) || (b2 == 6 && Arrays.equals(iArr, l));
        }
        return false;
    }

    private static boolean a(byte[] bArr) throws IOException {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f1231a;
            if (i2 < bArr2.length) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            } else {
                return true;
            }
        }
    }

    private static long[] a(Object obj) {
        if (!(obj instanceof int[])) {
            if (!(obj instanceof long[])) {
                return null;
            }
            return (long[]) obj;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    private b b(String str) {
        if (TAG_ISO_SPEED_RATINGS.equals(str)) {
            str = TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        for (int i2 = 0; i2 < d.length; i2++) {
            b bVar = this.J[i2].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    private void b(a aVar) throws IOException {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        a(aVar, i2, 5);
        aVar.a(i3);
        aVar.a(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == t.f1234a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                b a2 = b.a((int) readShort, this.K);
                b a3 = b.a((int) readShort2, this.K);
                this.J[0].put(TAG_IMAGE_LENGTH, a2);
                this.J[0].put(TAG_IMAGE_WIDTH, a3);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(android.support.media.ExifInterface.a r25, int r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.media.ExifInterface.b(android.support.media.ExifInterface$a, int):void");
    }

    private void b(a aVar, HashMap hashMap) throws IOException {
        b bVar = (b) hashMap.get(TAG_STRIP_OFFSETS);
        b bVar2 = (b) hashMap.get(TAG_STRIP_BYTE_COUNTS);
        if (bVar == null || bVar2 == null) {
            return;
        }
        long[] a2 = a(bVar.d(this.K));
        long[] a3 = a(bVar2.d(this.K));
        if (a2 == null || a3 == null) {
            return;
        }
        long j2 = 0;
        for (long j3 : a3) {
            j2 += j3;
        }
        byte[] bArr = new byte[(int) j2];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < a2.length; i4++) {
            int i5 = (int) a2[i4];
            int i6 = (int) a3[i4];
            int i7 = i5 - i2;
            aVar.a(i7);
            int i8 = i2 + i7;
            byte[] bArr2 = new byte[i6];
            aVar.read(bArr2);
            i2 = i8 + i6;
            System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
            i3 += bArr2.length;
        }
        this.L = true;
        this.O = bArr;
        this.N = bArr.length;
    }

    private void b(InputStream inputStream) throws IOException {
        a(0, 5);
        a(0, 4);
        a(5, 4);
        b bVar = this.J[1].get(TAG_PIXEL_X_DIMENSION);
        b bVar2 = this.J[1].get(TAG_PIXEL_Y_DIMENSION);
        if (bVar != null && bVar2 != null) {
            this.J[0].put(TAG_IMAGE_WIDTH, bVar);
            this.J[0].put(TAG_IMAGE_LENGTH, bVar2);
        }
        if (this.J[4].isEmpty() && b(this.J[5])) {
            HashMap<String, b>[] hashMapArr = this.J;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        b(this.J[4]);
    }

    private boolean b(HashMap hashMap) throws IOException {
        b bVar = (b) hashMap.get(TAG_IMAGE_LENGTH);
        b bVar2 = (b) hashMap.get(TAG_IMAGE_WIDTH);
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.b(this.K) <= 512 && bVar2.b(this.K) <= 512;
    }

    private boolean b(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i2 = 0; i2 < bytes.length; i2++) {
            if (bArr[i2] != bytes[i2]) {
                return false;
            }
        }
        return true;
    }

    private void c() {
        String a2 = a(TAG_DATETIME_ORIGINAL);
        if (a2 != null && a(TAG_DATETIME) == null) {
            this.J[0].put(TAG_DATETIME, b.a(a2));
        }
        if (a(TAG_IMAGE_WIDTH) == null) {
            this.J[0].put(TAG_IMAGE_WIDTH, b.a(0L, this.K));
        }
        if (a(TAG_IMAGE_LENGTH) == null) {
            this.J[0].put(TAG_IMAGE_LENGTH, b.a(0L, this.K));
        }
        if (a(TAG_ORIENTATION) == null) {
            this.J[0].put(TAG_ORIENTATION, b.a(0L, this.K));
        }
        if (a(TAG_LIGHT_SOURCE) == null) {
            this.J[1].put(TAG_LIGHT_SOURCE, b.a(0L, this.K));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(android.support.media.ExifInterface.a r7) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.media.ExifInterface.c(android.support.media.ExifInterface$a):void");
    }

    private void c(a aVar, int i2) throws IOException {
        b bVar;
        b bVar2 = this.J[i2].get(TAG_IMAGE_LENGTH);
        b bVar3 = this.J[i2].get(TAG_IMAGE_WIDTH);
        if ((bVar2 == null || bVar3 == null) && (bVar = this.J[i2].get(TAG_JPEG_INTERCHANGE_FORMAT)) != null) {
            a(aVar, bVar.b(this.K), i2);
        }
    }

    private boolean c(byte[] bArr) throws IOException {
        a aVar = new a(bArr);
        this.K = e(aVar);
        aVar.a(this.K);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    private void d(a aVar) throws IOException {
        a(aVar);
        if (this.J[0].get(TAG_RW2_JPG_FROM_RAW) != null) {
            a(aVar, this.U, 5);
        }
        b bVar = this.J[0].get(TAG_RW2_ISO);
        b bVar2 = this.J[1].get(TAG_PHOTOGRAPHIC_SENSITIVITY);
        if (bVar == null || bVar2 != null) {
            return;
        }
        this.J[1].put(TAG_PHOTOGRAPHIC_SENSITIVITY, bVar);
    }

    private void d(a aVar, int i2) throws IOException {
        b a2;
        b a3;
        b bVar = this.J[i2].get(TAG_DEFAULT_CROP_SIZE);
        b bVar2 = this.J[i2].get(TAG_RW2_SENSOR_TOP_BORDER);
        b bVar3 = this.J[i2].get(TAG_RW2_SENSOR_LEFT_BORDER);
        b bVar4 = this.J[i2].get(TAG_RW2_SENSOR_BOTTOM_BORDER);
        b bVar5 = this.J[i2].get(TAG_RW2_SENSOR_RIGHT_BORDER);
        if (bVar == null) {
            if (bVar2 == null || bVar3 == null || bVar4 == null || bVar5 == null) {
                c(aVar, i2);
                return;
            }
            int b2 = bVar2.b(this.K);
            int b3 = bVar4.b(this.K);
            int b4 = bVar5.b(this.K);
            int b5 = bVar3.b(this.K);
            if (b3 <= b2 || b4 <= b5) {
                return;
            }
            b a4 = b.a(b3 - b2, this.K);
            b a5 = b.a(b4 - b5, this.K);
            this.J[i2].put(TAG_IMAGE_LENGTH, a4);
            this.J[i2].put(TAG_IMAGE_WIDTH, a5);
            return;
        }
        if (bVar.f1233a == 5) {
            d[] dVarArr = (d[]) bVar.d(this.K);
            if (dVarArr == null || dVarArr.length != 2) {
                String str = "Invalid crop size values. cropSize=" + Arrays.toString(dVarArr);
                return;
            }
            a2 = b.a(dVarArr[0], this.K);
            a3 = b.a(dVarArr[1], this.K);
        } else {
            int[] iArr = (int[]) bVar.d(this.K);
            if (iArr == null || iArr.length != 2) {
                String str2 = "Invalid crop size values. cropSize=" + Arrays.toString(iArr);
                return;
            }
            a2 = b.a(iArr[0], this.K);
            a3 = b.a(iArr[1], this.K);
        }
        this.J[i2].put(TAG_IMAGE_WIDTH, a2);
        this.J[i2].put(TAG_IMAGE_LENGTH, a3);
    }

    private boolean d(byte[] bArr) throws IOException {
        a aVar = new a(bArr);
        this.K = e(aVar);
        aVar.a(this.K);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    private ByteOrder e(a aVar) throws IOException {
        short readShort = aVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    private void f(a aVar) throws IOException {
        HashMap<String, b> hashMap = this.J[4];
        b bVar = hashMap.get(TAG_COMPRESSION);
        if (bVar != null) {
            this.P = bVar.b(this.K);
            int i2 = this.P;
            if (i2 != 1) {
                if (i2 != 6) {
                    if (i2 != 7) {
                        return;
                    }
                }
            }
            if (!a((HashMap) hashMap)) {
                return;
            }
            b(aVar, hashMap);
            return;
        }
        this.P = 6;
        a(aVar, hashMap);
    }

    public int a() {
        switch (a(TAG_ORIENTATION, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public int a(String str, int i2) {
        b b2 = b(str);
        if (b2 == null) {
            return i2;
        }
        try {
            return b2.b(this.K);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public String a(String str) {
        b b2 = b(str);
        if (b2 != null) {
            if (!D.contains(str)) {
                return b2.c(this.K);
            }
            if (str.equals(TAG_GPS_TIMESTAMP)) {
                if (b2.f1233a != 5 && b2.f1233a != 10) {
                    String str2 = "GPS Timestamp format is not rational. format=" + b2.f1233a;
                    return null;
                }
                d[] dVarArr = (d[]) b2.d(this.K);
                if (dVarArr != null && dVarArr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) dVarArr[0].f1235a) / ((float) dVarArr[0].b))), Integer.valueOf((int) (((float) dVarArr[1].f1235a) / ((float) dVarArr[1].b))), Integer.valueOf((int) (((float) dVarArr[2].f1235a) / ((float) dVarArr[2].b))));
                }
                String str3 = "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr);
                return null;
            }
            try {
                return Double.toString(b2.a(this.K));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
