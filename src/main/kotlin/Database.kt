class Database {
    private var categories: List<Category> = mutableListOf();
    private var features: List<Feature> = mutableListOf();

    fun getCategories() : List<Category> {
        return categories;
    }

    fun getFeatures() : List<Feature> {
        return features;
    }
}

data class Category(
    val categoryId: Int,
    val name: String
)

data class Feature(
    val featureId: Int,
    val categoryId: Int,
    val title: String,
    var value: Int
)