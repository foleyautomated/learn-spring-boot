# 02-spring-boot-spring-core

Spring boot essentially lets you use @annotations instead of filepaths to tell the compiler where things are. In short, `Annotations + Component Scanner > import + path`

`alt` + `ins` to open the "Generate" Menu in Intelij


Root
IveMissedCheeseSince2024!

Lactos
IMissButter2!

# 68 - JPA annotations
Technically, you can avoid @Column and @Table --It will just default to the exact name of the table/column. 
But, this approach creates difficult to refactor inter-dependency.

Prefer the `GenerationType.IDENTITY` Id Generation strategy for most cases, as it aligns with the id in the Database.
Can override with a custom generation type, if desired. 

# 70 EntityManger vs JpaRepository
- Use EntityManger for fine control and JpaRepository for flexibility