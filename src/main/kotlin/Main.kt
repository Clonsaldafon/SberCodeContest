fun main(args: Array<String>) {
    val db: Database = Database();

    var categories: List<Category> = db.getCategories();
    var features: List<Feature> = db.getFeatures();

    categories = categories.sortedBy { it.categoryId };
    features = features.sortedBy { it.featureId };

    val mergedList: List<Any> = mergeCategoriesAndFeatures(categories, features);
}

fun mergeCategoriesAndFeatures(categories: List<Category>, features: List<Feature>) : List<Any> {
    val result = mutableListOf<Any>();

    for(category in categories) {
        result.add(category);

        for(feature in features) {
            if(feature.categoryId == category.categoryId) {
                result.add(feature);
            }
        }

        result.add(category.categoryId);
    }

    return result;
}