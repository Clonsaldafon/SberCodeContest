class Database {
    private var categories: List<Category> = mutableListOf(
        Category(5, "Category_5"),
        Category(3, "Category_3"),
        Category(1, "Category_1"),
        Category(2, "Category_2"),
        Category(4, "Category_4")
    );

    private var features: List<Feature> = mutableListOf(
        Feature(8, 3, "Feature_8", 50),
        Feature(4, 2, "Feature_4", 350),
        Feature(2, 4, "Feature_2", 150),
        Feature(14, 3, "Feature_14", 450),
        Feature(3, 5, "Feature_3", 520),
        Feature(7, 4, "Feature_7", 50),
        Feature(13, 3, "Feature_13", 550),
        Feature(5, 1, "Feature_5", 250),
        Feature(9, 2, "Feature_9", 550),
        Feature(1, 1, "Feature_1", 560),
        Feature(12, 1, "Feature_12", 50),
        Feature(6, 3, "Feature_6", 500),
        Feature(11, 5, "Feature_11", 540),
        Feature(10, 3, "Feature_10", 50),
    );

    fun getCategories(): List<Category> {
        return categories;
    }

    fun getFeatures(): List<Feature> {
        return features;
    }
}

data class Category(val categoryId: Int, val name: String)
data class Feature(val featureId: Int, val categoryId: Int, val title: String, var value: Int)